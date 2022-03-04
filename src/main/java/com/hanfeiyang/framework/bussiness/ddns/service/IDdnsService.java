package com.hanfeiyang.framework.bussiness.ddns.service;

import com.hanfeiyang.framework.bussiness.ddns.enetity.AliAccessKey;

import java.util.List;

/**
 * @author HanFeiYang
 * @date 2022/3/2 16:24
 */
public interface IDdnsService {
    AliAccessKey getAliAccessKey();
    void doDDNS(List<String> recList);
}
