package com.hanfeiyang.framework.bussiness.param.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hanfeiyang.framework.bussiness.param.entity.Param;
import com.hanfeiyang.framework.bussiness.param.enums.ParamTypeEnum;
import com.hanfeiyang.framework.bussiness.param.mapper.ParamMapper;
import com.hanfeiyang.framework.bussiness.param.service.IParamsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-02
 */
@Service
public class ParamsServiceImpl extends ServiceImpl<ParamMapper, Param> implements IParamsService {

    @Override
    public Param getParamByType(ParamTypeEnum paramTypeEnum) {
        return this.getOne(new LambdaQueryWrapper<Param>().eq(Param::getType, paramTypeEnum.getTypeCode()));
    }
}
