package com.example.nanqiao.core.service;

import com.example.nanqiao.common.request.activity.ApplyCreateRequest;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
public interface ActivityApplyService {
    /**
     * 活动报名
     */
    void createApply(ApplyCreateRequest request);
}
