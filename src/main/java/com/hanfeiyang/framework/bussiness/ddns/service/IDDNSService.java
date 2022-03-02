package com.hanfeiyang.framework.bussiness.ddns.service;

import com.hanfeiyang.framework.bussiness.ddns.enetity.AliAccessKey;

/**
 * @author HanFeiYang
 * @date 2022/3/2 16:24
 */
public interface IDDNSService {
    AliAccessKey getAliAccessKey();
    void doDDNS();
}
