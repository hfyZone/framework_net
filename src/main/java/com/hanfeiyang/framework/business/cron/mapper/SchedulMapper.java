package com.hanfeiyang.framework.business.cron.mapper;

import com.hanfeiyang.framework.business.cron.entity.Schedul;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 定时任务 Mapper 接口
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-07
 */
@Repository
@Mapper
public interface SchedulMapper extends BaseMapper<Schedul> {

}
