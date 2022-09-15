package com.example.nanqiao.common.request.activity;

/**
 * @Author: coco
 * @Date: 2022/9/11
 **/

import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 活动报名审核
 */
@Data
public class ApplyAuditRequest extends BaseRequest {
    private static final long serialVersionUID = -1401046257365328428L;
    /**
     * 活动ID
     */
    private String activityId;
    /**
     * 审核人
     */
    private String auditor;
    /**
     * 审核结果 1-审核通过 2-审核拒绝
     */
    @NotNull(message = "审核结果不能为空")
    private Integer auditResult;
    /**
     * 超出人数是否继续审核通过 0-否 1-是
     */
    private Integer forceAuditSuccess=0;
}
