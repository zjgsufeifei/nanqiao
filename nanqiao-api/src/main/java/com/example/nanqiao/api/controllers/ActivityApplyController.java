package com.example.nanqiao.api.controllers;

import com.example.nanqiao.common.request.activity.ApplyCreateRequest;
import com.example.nanqiao.common.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @Author: haiyi
 * @Date: 2022/9/10
 **/
@Slf4j
@Controller
@RequestMapping("/nan_qiao/activity/apply")
public class ActivityApplyController {
    /**
     * 活动报名
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse createApply(@RequestBody @Valid ApplyCreateRequest request) {
        return null;
    }
}
