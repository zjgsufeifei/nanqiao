package com.example.nanqiao.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@Getter
@AllArgsConstructor
public enum ActivityApplyStatusEnum {
    /**
     * 审核中
     */
    AUDITING(0,"审核中"),
    /**
     * 报名成功（审核通过）
     */
    APPLY_SUCCESS(10,"报名成功"),
    /**
     * 报名失败（审核拒接）
     */
    APPLY_FAILED(20,"报名失败"),
    /**
     * 活动结束
     */
    ACTIVITY_ENDED(99,"活动结束"),;

    private final Integer code;
    private final String desc;

}
