package com.example.nanqiao.dao.mapper.manual;

import com.example.nanqiao.dao.entity.ActivityApplyStatisticsDO;
import com.example.nanqiao.dao.entity.ActivityApplyStatisticsDOExample;

import java.util.List;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
public interface ActivityApplyStatisticsManualMapper {
    List<ActivityApplyStatisticsDO>  selectByActivityIdForUpdate(ActivityApplyStatisticsDOExample example);
}
