package com.example.nanqiao.core.service;

import com.example.nanqiao.common.request.activity.ActivityCreateRequest;
import com.example.nanqiao.common.request.activity.ActivityDetailInfoRequest;
import com.example.nanqiao.common.response.activity.CreateActivityResponse;
import com.example.nanqiao.dao.entity.ActivityInfoDO;

/**
 * @Author: coco
 * @Date: 2022/9/15
 **/
public interface ActivityInfoService {
    /**
     * 创建活动
     */
    CreateActivityResponse createActivity(ActivityCreateRequest request);

    /**
     * 查询活动详情
     */

    ActivityInfoDO queryActivityDetail(ActivityDetailInfoRequest request);
}
