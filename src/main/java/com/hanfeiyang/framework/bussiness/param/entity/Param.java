package com.hanfeiyang.framework.bussiness.param.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-02
 */
@Data
public class Param implements Serializable {

    private static final long serialVersionUID = 1L;

    private String uuid;

    private String key;

    private String value;

    private String type;

    private String description;

    private LocalDateTime gmtModified;

    private LocalDateTime gmtCreated;



}
