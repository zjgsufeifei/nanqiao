package com.example.nanqiao.api.controllers;

import com.example.nanqiao.common.request.activity.ApplyCreateRequest;
import com.example.nanqiao.common.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@Slf4j
@RestController
@RequestMapping("/nan_qiao/activity/apply")
public class ActivityApplyController {
    /**
     * 活动报名
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public BaseResponse createApply(@RequestBody ApplyCreateRequest request) {
        return null;
    }
}
