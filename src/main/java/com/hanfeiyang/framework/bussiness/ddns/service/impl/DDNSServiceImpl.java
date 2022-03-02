package com.hanfeiyang.framework.bussiness.ddns.service.impl;

import com.hanfeiyang.framework.bussiness.ddns.enetity.AliAccessKey;
import com.hanfeiyang.framework.bussiness.ddns.service.IDDNSService;
import com.hanfeiyang.framework.bussiness.ddns.utils.DDNSUtils;
import com.hanfeiyang.framework.bussiness.param.entity.Param;
import com.hanfeiyang.framework.bussiness.param.enums.ParamTypeEnum;
import com.hanfeiyang.framework.bussiness.param.service.IParamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HanFeiYang
 * @date 2022/3/2 16:25
 */
@Service
public class DDNSServiceImpl implements IDDNSService {

    @Autowired
    IParamsService paramsService;


    @Override
    public AliAccessKey getAliAccessKey() {
        Param param = paramsService.getParamByType(ParamTypeEnum.ALIYUN_ACCESS_KEY);
        AliAccessKey aliAccessKey = new AliAccessKey()
                .setAccessKeyID(param.getKey())
                .setAccessKeySecret(param.getValue());
        return aliAccessKey;
    }

    @Override
    public void doDDNS() {
        //  设置鉴权参数，初始化客户端
        AliAccessKey aliAccessKey = getAliAccessKey();
        DDNSUtils.doDDNS(aliAccessKey, "*");
    }
}
