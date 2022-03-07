package com.hanfeiyang.framework.business.ddns.enetity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author HanFeiYang
 * @date 2022/3/2 16:51
 */
@Data
@Accessors(chain = true)
public class AliAccessKey {
    private String regionID = "cn-hangzhou";
    private String AccessKeyID;
    private String AccessKeySecret;
}
