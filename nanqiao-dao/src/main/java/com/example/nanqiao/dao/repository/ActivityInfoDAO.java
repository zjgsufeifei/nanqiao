package com.example.nanqiao.dao.repository;

import com.example.nanqiao.dao.entity.ActivityInfoDO;

/**
 * @Author: coco
 * @Date: 2022/9/15
 **/
public interface ActivityInfoDAO {
    void createActivityInfo(ActivityInfoDO activityInfoDO);

    ActivityInfoDO selectByUk(String activityId);
}
