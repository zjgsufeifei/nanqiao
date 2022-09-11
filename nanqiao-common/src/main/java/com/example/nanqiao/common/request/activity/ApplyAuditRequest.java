package com.example.nanqiao.common.request.activity;

/**
 * @Author: coco
 * @Date: 2022/9/11
 **/

import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

/**
 * 活动报名审核
 */
@Data
public class ApplyAuditRequest extends BaseRequest {
    private static final long serialVersionUID = -1401046257365328428L;
    /**
     * 活动ID
     */
    private Long activityId;
    /**
     * 审核人
     */
    private String auditor;
}
