package com.hanfeiyang.framework.business.cron.configs;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hanfeiyang.framework.business.cron.entity.Schedul;
import com.hanfeiyang.framework.business.cron.service.ISchedulService;
import com.hanfeiyang.framework.business.cron.task.ScheduledOfTask;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.util.Assert;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author HanFeiYang
 * @date 2022/3/7 17:21
 */
@Configuration
public class ScheduledConfig implements SchedulingConfigurer {
    @Autowired
    private ApplicationContext context;
    @Autowired
    private ISchedulService schedulService;
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        System.out.println("----------------------->配置类已加载<--------------");
        for (Schedul schedul : schedulService.list()) {
            Class<?> clazz;
            Object task;
            try {
                clazz = Class.forName(schedul.getTaskClassName());
                task = context.getBean(clazz);
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException("schedul表数据" + schedul.getTaskClassName() + "有误", e);
            } catch (BeansException e) {
                throw new IllegalArgumentException(schedul.getTaskClassName() + "未纳入到spring管理", e);
            }
            Assert.isAssignable(ScheduledOfTask.class, task.getClass(), "定时任务类必须实现ScheduledOfTask接口");
            // 可以通过改变数据库数据进而实现动态改变执行周期
            taskRegistrar.addTriggerTask(((Runnable) task),
                    triggerContext -> {
                        String cronExpression = schedulService.getOne(new LambdaQueryWrapper<Schedul>().eq(Schedul::getTaskClassName, schedul.getTaskClassName())).getCronExpression();
                        return new CronTrigger(cronExpression).nextExecutionTime(triggerContext);
                    }
            );
        }
    }
    @Bean
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(10);
    }
}
