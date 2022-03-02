package com.hanfeiyang.framework.bussiness.param.enums;

/**
 * @author HanFeiYang
 * @date 2022/3/2 16:26
 */
public enum ParamTypeEnum {
    ALIYUN_ACCESS_KEY("ALIYUN_ACCESS_KEY", "阿里云后台密钥");
    ;
    private String typeCode;
    private String typeDescription;

    ParamTypeEnum(String typeCode, String typeDescription) {
        this.typeCode = typeCode;
        this.typeDescription = typeDescription;
    }

    public String getTypeCode() {
        return typeCode;
    }
}