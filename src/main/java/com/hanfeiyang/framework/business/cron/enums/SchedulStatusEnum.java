package com.hanfeiyang.framework.business.cron.enums;

/**
 * @author HanFeiYang
 * @date 2022/3/7 17:51
 */
public enum SchedulStatusEnum {
    ENABLED(1,"启用"),
    DISABLED(0,"停用");

    private Integer code;
    private String description;

    SchedulStatusEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }
}
