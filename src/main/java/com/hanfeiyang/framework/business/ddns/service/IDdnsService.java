package com.hanfeiyang.framework.business.ddns.service;

import com.hanfeiyang.framework.business.ddns.enetity.AliAccessKey;
import com.hanfeiyang.framework.business.ddns.enetity.dto.DdnsDTO;

import java.util.List;

/**
 * @author HanFeiYang
 * @date 2022/3/2 16:24
 */
public interface IDdnsService {
    AliAccessKey getAliAccessKey();
    void doDDNS(List<DdnsDTO> ddnsDTOList);
}
