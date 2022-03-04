package com.hanfeiyang.framework.utils;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author YoungNet
 * @date 2021/12/10 16:21
 */
@Data
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer code;
    private String msg;
    private Boolean status;
    private T data;

    private R(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R(Integer code, Boolean status) {
        this.code = code;
        this.status = status;
    }

    private R(Integer code, String msg, Boolean status) {
        this.code = code;
        this.msg = msg;
        this.status = status;
    }

    public R(Integer code, String msg, T data, Boolean status) {
        this.code = code;
        this.msg = msg;
        this.status = status;
        this.data = data;
    }

    public static <T> R<T> success(){
        return new R(HttpStatus.OK.value(), "success");
    }

    public static <T> R<T> success(T data){
        return new R(HttpStatus.OK.value(), "success", data, true);
    }
    public static <T> R<T> success(Boolean status){
        return new R(HttpStatus.OK.value(), "success", status);
    }

    public static <T> R<T> failure(){
        return new R(HttpStatus.NOT_FOUND.value(), false);
    }
    public static <T> R<T> failure(String msg){
        return new R(HttpStatus.NOT_FOUND.value(), msg, false);
    }
    public static <T> R<T> failure(Integer code, String msg){
        return new R(code, msg, false);
    }
}
