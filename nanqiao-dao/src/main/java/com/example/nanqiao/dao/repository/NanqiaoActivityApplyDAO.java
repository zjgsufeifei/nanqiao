package com.example.nanqiao.dao.repository;

import com.example.nanqiao.common.enums.ActivityApplyStatusEnum;
import com.example.nanqiao.dao.bo.ActivityApplyBO;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDO;

import java.util.List;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
public interface NanqiaoActivityApplyDAO{
    /**
     * 查询用户报名信息
     */
    List<NanqiaoActivityApplyDO> queryActivityApplyInfo(String openId,Long activityId);

    /**
     * 报名活动
     */
    void applyActivity(String openId,Long activityId,ActivityApplyBO activityApplyBO);

    /**
     * 更新申请状态
     */
    void updateApplyStatus(String openId, Long activityId, ActivityApplyStatusEnum applyStatus);
}
