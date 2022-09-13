package com.example.nanqiao.core.service;

import com.example.nanqiao.common.request.activity.ApplyAuditRequest;
import com.example.nanqiao.common.request.activity.ApplyCreateRequest;
import com.example.nanqiao.common.request.activity.ApplyResultDetailQueryRequest;
import com.example.nanqiao.common.request.activity.ApplyResultListQueryRequest;
import com.example.nanqiao.common.response.activity.ApplyListResponse;
import com.example.nanqiao.common.response.activity.ApplyResultQueryResponse;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
public interface ActivityApplyService {
    /**
     * 活动报名
     */
    void createApply(ApplyCreateRequest request);
    /**
     * 审核报名
     */
    void auditApply(ApplyAuditRequest request);

    /***
     * 查询报名结果
     */
    ApplyResultQueryResponse queryApplyDetail(ApplyResultDetailQueryRequest request);
    /**
     * 报名列表
     */
    ApplyListResponse queryApplyList(ApplyResultListQueryRequest request);
}
