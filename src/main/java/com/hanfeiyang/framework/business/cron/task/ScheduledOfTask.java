package com.hanfeiyang.framework.business.cron.task;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hanfeiyang.framework.business.cron.entity.Schedul;
import com.hanfeiyang.framework.business.cron.enums.SchedulStatusEnum;
import com.hanfeiyang.framework.business.cron.service.ISchedulService;
import com.hanfeiyang.framework.business.cron.service.impl.SchedulServiceImpl;
import com.hanfeiyang.framework.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author HanFeiYang
 * @date 2022/3/7 17:28
 */
public interface ScheduledOfTask extends Runnable {

    /**
     * 定时任务方法
     */
    void execute();
    /**
     * 实现控制定时任务启用或禁用的功能
     */
    @Override
    default void run() {
        ISchedulService schedulService = BeanUtil.getBean(SchedulServiceImpl.class);
        Schedul schedul = schedulService.getOne(new LambdaQueryWrapper<Schedul>().eq(Schedul::getTaskClassName, this.getClass().getName()));
        if (SchedulStatusEnum.DISABLED.getCode().equals(schedul.getStatus())) {
            // 任务是禁用状态
            return;
        }
        execute();
    }
}
