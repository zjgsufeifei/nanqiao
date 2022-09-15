package com.example.nanqiao.core.service.impl;

import com.example.nanqiao.common.request.activity.ActivityCreateRequest;
import com.example.nanqiao.common.request.activity.ActivityDetailInfoRequest;
import com.example.nanqiao.common.response.activity.CreateActivityResponse;
import com.example.nanqiao.core.service.ActivityInfoService;
import com.example.nanqiao.dao.entity.ActivityInfoDO;
import com.example.nanqiao.dao.repository.ActivityInfoDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author: coco
 * @Date: 2022/9/15
 **/
@Service
@Slf4j
public class ActivityInfoServiceImpl implements ActivityInfoService {
    @Resource
    private ActivityInfoDAO activityInfoDAO;
    @Override
    public CreateActivityResponse createActivity(ActivityCreateRequest request) {
        ActivityInfoDO initActivityInfo=new ActivityInfoDO();
        initActivityInfo.setActivityId(UUID.randomUUID().toString());
        initActivityInfo.setTitle(request.getTitle());
        initActivityInfo.setImagePath(request.getImagePath());
        initActivityInfo.setDescPath(request.getDescPath());
        initActivityInfo.setContentPath(request.getContentPath());
        initActivityInfo.setAttentionPath(request.getAttentionPath());
        initActivityInfo.setNumberLimit(request.getNumberLimit());
        initActivityInfo.setAddress(request.getAddress());
        initActivityInfo.setStartTime(request.getStartTime());
        initActivityInfo.setCreator(request.getCreator());
        activityInfoDAO.createActivityInfo(initActivityInfo);
        return CreateActivityResponse.builder().activityId(initActivityInfo.getActivityId()).build();
    }

    @Override
    public ActivityInfoDO queryActivityDetail(ActivityDetailInfoRequest request) {
        return activityInfoDAO.selectByUk(request.getActivityId());
    }
}
