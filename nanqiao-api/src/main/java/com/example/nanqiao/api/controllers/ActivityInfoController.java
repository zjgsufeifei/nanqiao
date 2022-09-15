package com.example.nanqiao.api.controllers;

/**
 * @Author: coco
 * @Date: 2022/9/15
 **/

import com.example.nanqiao.common.request.activity.ActivityCreateRequest;
import com.example.nanqiao.common.request.activity.ActivityDetailInfoRequest;
import com.example.nanqiao.common.response.BaseResponse;
import com.example.nanqiao.common.response.activity.CreateActivityResponse;
import com.example.nanqiao.core.service.ActivityInfoService;
import com.example.nanqiao.dao.entity.ActivityInfoDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 活动信息
 */
@RestController
@RequestMapping("/nan_qiao/activity/info")
@Slf4j
public class ActivityInfoController {
    @Resource
    private ActivityInfoService activityInfoService;
    /**
     * 创建活动
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public BaseResponse<CreateActivityResponse> createActivity(@RequestBody ActivityCreateRequest request) {
        return BaseResponse.success(activityInfoService.createActivity(request)).build();
    }

    /**
     * 查询活动详情
     */
    @RequestMapping(value = "/query/detail", method = RequestMethod.POST)
    public BaseResponse<ActivityInfoDO> queryActivityDetail(@RequestBody ActivityDetailInfoRequest request) {
        return BaseResponse.success(activityInfoService.queryActivityDetail(request)).build();
    }
}
