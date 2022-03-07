package com.hanfeiyang.framework.business.param.mapper;

import com.hanfeiyang.framework.business.param.entity.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-02
 */
@Component
@Mapper
public interface ParamMapper extends BaseMapper<Param> {

}
