package com.hanfeiyang.framework.business.cron.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 定时任务
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-07
 */
@Data
public class Schedul implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String taskClassName;

    private String cronExpression;

    private String taskDescription;

    /**
     * 0禁用，1启用
     */
    private Integer status;

    private LocalDateTime gmtModified;

    private LocalDateTime gmtCreated;




    @Override
    public String toString() {
        return "Schedul{" +
        "uuid=" + id +
        ", taskClassName=" + taskClassName +
        ", cronExpress=" + cronExpression +
        ", taskDescription=" + taskDescription +
        ", status=" + status +
        ", gmtModified=" + gmtModified +
        ", gmtCreated=" + gmtCreated +
        "}";
    }
}
