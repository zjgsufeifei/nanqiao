package com.example.nanqiao.dao.repository;

import com.example.nanqiao.dao.bo.ActivityStatisticsBO;
import com.example.nanqiao.dao.entity.ActivityApplyStatisticsDO;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
public interface ActivityApplyStatisticsDAO {
    ActivityApplyStatisticsDO selectApplyStatisticsByUk(Long activityId);
    /**
     * 记录统计数据
     */
    @Transactional
    void recordActivityStatistics(Long activityId,String activityName,ActivityStatisticsBO activityStatisticsBO);
}
