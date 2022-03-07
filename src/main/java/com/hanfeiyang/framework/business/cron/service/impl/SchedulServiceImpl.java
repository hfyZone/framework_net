package com.hanfeiyang.framework.business.cron.service.impl;

import com.hanfeiyang.framework.business.cron.entity.Schedul;
import com.hanfeiyang.framework.business.cron.mapper.SchedulMapper;
import com.hanfeiyang.framework.business.cron.service.ISchedulService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务 服务实现类
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-07
 */
@Service
public class SchedulServiceImpl extends ServiceImpl<SchedulMapper, Schedul> implements ISchedulService {

}
