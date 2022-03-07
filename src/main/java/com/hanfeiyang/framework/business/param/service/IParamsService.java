package com.hanfeiyang.framework.business.param.service;

import com.hanfeiyang.framework.business.param.entity.Param;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hanfeiyang.framework.business.param.enums.ParamTypeEnum;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-02
 */
public interface IParamsService extends IService<Param> {
    Param getParamByType(ParamTypeEnum paramTypeEnum);
}
