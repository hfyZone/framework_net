package com.hanfeiyang.framework.business.ddns.enetity.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author HanFeiYang
 * @date 2022/3/7 17:00
 */
@Data
@Accessors(chain = true)
public class DdnsDTO {
    private String record;
    private String domainName;
}
