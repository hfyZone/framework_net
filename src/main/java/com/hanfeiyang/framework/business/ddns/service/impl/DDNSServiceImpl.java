package com.hanfeiyang.framework.business.ddns.service.impl;

import com.hanfeiyang.framework.business.ddns.entity.AliAccessKey;
import com.hanfeiyang.framework.business.ddns.entity.dto.DomainDTO;
import com.hanfeiyang.framework.business.ddns.service.IDdnsService;
import com.hanfeiyang.framework.business.ddns.utils.DDNSUtils;
import com.hanfeiyang.framework.business.param.entity.Param;
import com.hanfeiyang.framework.business.param.enums.ParamTypeEnum;
import com.hanfeiyang.framework.business.param.service.IParamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HanFeiYang
 * @date 2022/3/2 16:25
 */
@Service
public class DDNSServiceImpl implements IDdnsService {

    @Autowired
    IParamsService paramsService;


    @Override
    public AliAccessKey getAliAccessKey() {
        Param param = paramsService.getParamByType(ParamTypeEnum.ALIYUN_ACCESS_KEY);
        AliAccessKey aliAccessKey = new AliAccessKey()
                .setAccessKeyID(param.getParamKey())
                .setAccessKeySecret(param.getParamValue());
        return aliAccessKey;
    }

    @Override
    public void doDDNS(List<DomainDTO> domainDTOList) {
        //  设置鉴权参数，初始化客户端
        AliAccessKey aliAccessKey = getAliAccessKey();
        domainDTOList.forEach(domainDTO -> DDNSUtils.doDDNS(aliAccessKey, domainDTO.getDomainRecord(), domainDTO.getDomainName()));
    }
}
