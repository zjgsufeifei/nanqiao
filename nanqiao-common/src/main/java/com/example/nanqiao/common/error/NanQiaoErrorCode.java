package com.example.nanqiao.common.error;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
public enum NanQiaoErrorCode {
    SUCCESS(1000000, "SUCCESS"),

    ////////////////////////////////////////////////// 公共异常300000~309999/////////////////////////////////////////
    /**
     * 参数错误
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
    SYSTEM_ERROR(300006, "系统异常，请重试"),
    /**
     * 并发修改
     */
    CONCURRENT_MODIFY(300014, "并发修改"),
    /**
     * 操作过于频繁
     */
    OPERATE_TOO_FREQUENT(300018, "操作过于频繁，请稍后再试"),

    /**
     * 上传文件太大
     */
    FILE_TOO_BIG(300030, "上传文件太大，请不要超过"),

    ////////////////////////////////////////////////// 公共业务异常310000~399999/////////////////////////////////////////
    /**
     * 活动还未开始
     */
    ACTIVITY_NOT_START(310000, "活动还未开始"),
    /**
     * 活动已结束
     */
    ACTIVITY_ENDED(310001, "活动已结束"),
    /**
     * 已报名过该活动
     */
    ALREADY_APPLY_ACTIVITY(310002, "已报名过该活动，不能重复报名"),

    /**
     * 未查询到该用户的申请
     */
    APPLY_NOT_EXIST(310003, "未查询到该用户的申请"),
    /**
     * 当前参与人数已超过活动限制人数
     */
    EXCEED_ACTIVITY_NUMBER(310004, "当前参与人数已超过活动限制人数"),
    ;


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
