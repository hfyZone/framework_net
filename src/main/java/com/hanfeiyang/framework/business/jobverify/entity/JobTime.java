package com.hanfeiyang.framework.business.jobverify.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

/**
 * @author HanFeiYang
 * @date 2022/3/31 16:43
 */
@Data
@EqualsAndHashCode
public class JobTime {
    @ExcelProperty(index = 12)
    private String actualJobTime;

    @ExcelProperty(index = 14)
    private String state;
}
