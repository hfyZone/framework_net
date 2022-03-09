package com.hanfeiyang.framework.business.cron.controller;


import com.hanfeiyang.framework.business.cron.task.ScheduledOfTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 定时任务 前端控制器
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-07
 */
@RestController
@RequestMapping("/schedul/")
public class SchedulController {
    @Autowired
    private ApplicationContext context;
    @GetMapping("runall/{cronkey}")
    private void runAllTask(@PathVariable("cronkey") String cronKey) throws ClassNotFoundException {
        ((ScheduledOfTask) context.getBean(Class.forName(cronKey))).execute();
    }

}

