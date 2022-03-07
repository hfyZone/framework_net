package com.hanfeiyang.framework.business.ddns.entity.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author HanFeiYang
 * @date 2022/3/7 17:00
 */
@Data
@Accessors(chain = true)
public class DomainDTO {
    private String domainRecord;
    private String domainName;
}
