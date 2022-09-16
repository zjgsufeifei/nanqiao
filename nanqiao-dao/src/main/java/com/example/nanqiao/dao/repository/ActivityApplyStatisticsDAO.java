package com.example.nanqiao.dao.repository;

import com.example.nanqiao.dao.bo.ActivityStatisticsBO;
import com.example.nanqiao.dao.entity.ActivityApplyStatisticsDO;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
public interface ActivityApplyStatisticsDAO {
    ActivityApplyStatisticsDO selectApplyStatisticsByUk(String activityId);
    /**
     * 记录统计数据
     */
    @Transactional
    void recordActivityStatistics(String activityId,String activityName,ActivityStatisticsBO activityStatisticsBO);
}
