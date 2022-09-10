package com.example.nanqiao.common.error;

/**
 * @Author: haiyi
 * @Date: 2022/9/10
 **/
public enum NanQiaoErrorCode {
    SUCCESS(1000000, "SUCCESS"),

    ////////////////////////////////////////////////// 公共异常300000~309999/////////////////////////////////////////
    /**
     * 通用错误码
     */
    PARAM_ILLEGAL(300000, "参数错误"),
    /**
     * 时间格式解析异常
     */
    DATETIME_PARSE_ERROR(300001, "时间格式解析异常"),
    /**
     * 远程调用失败
     */
    REMOTE_INVOKE_ERROR(300002, "远程调用失败"),
    /**
     * 时间参数非法
     */
    DATE_ILLEGAL(300005, "时间参数非法"),
    /**
     * 系统异常
     */
    SYSTEM_ERROR(300006, "系统异常"),
    /**
     * 并发修改
     */
    CONCURRENT_MODIFY(300014, "并发修改"),
    /**
     * 操作过于频繁
     */
    OPERATE_TOO_FREQUENT(300018, "操作过于频繁，请稍后再试"),
    ;

    ////////////////////////////////////////////////// 公共业务异常310000~399999/////////////////////////////////////////


    private final String description;
    private final int code;

    NanQiaoErrorCode(int code, String description) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
}
