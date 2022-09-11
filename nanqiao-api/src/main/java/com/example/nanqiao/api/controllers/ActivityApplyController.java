package com.example.nanqiao.api.controllers;

import com.example.nanqiao.common.request.activity.ApplyCreateRequest;
import com.example.nanqiao.common.response.BaseResponse;
import com.example.nanqiao.core.service.ActivityApplyService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@Slf4j
@RestController
@RequestMapping("/nan_qiao/activity/apply")
public class ActivityApplyController {
    @Resource
    private ActivityApplyService activityApplyService;
    /**
     * 活动报名
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public BaseResponse createApply(@RequestBody ApplyCreateRequest request) {
        activityApplyService.createApply(request);
        return BaseResponse.newSuccResponse().build();
    }

    /**
     * 活动报名审核
     */
    @RequestMapping(value = "/audit", method = RequestMethod.POST)
    public BaseResponse auditApply(@RequestBody ApplyCreateRequest request) {
        activityApplyService.createApply(request);
        return BaseResponse.newSuccResponse().build();
    }
}
