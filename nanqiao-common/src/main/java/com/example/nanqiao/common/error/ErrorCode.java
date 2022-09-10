package com.example.nanqiao.common.error;

import java.io.Serializable;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
public class ErrorCode implements Serializable {
    private static final long serialVersionUID = -3373769989785001772L;

    /**
     * 错误码
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String message;

    public ErrorCode() {

    }

    public ErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
