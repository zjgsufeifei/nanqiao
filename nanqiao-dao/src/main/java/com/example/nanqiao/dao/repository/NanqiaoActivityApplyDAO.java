package com.example.nanqiao.dao.repository;

import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDO;

import java.util.List;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
public interface NanqiaoActivityApplyDAO{
    List<NanqiaoActivityApplyDO> queryActivityApplyInfo(String openId,Long activityId);
}
