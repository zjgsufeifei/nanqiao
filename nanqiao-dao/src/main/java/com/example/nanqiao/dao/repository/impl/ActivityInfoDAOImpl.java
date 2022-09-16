package com.example.nanqiao.dao.repository.impl;

import com.example.nanqiao.dao.entity.ActivityInfoDO;
import com.example.nanqiao.dao.entity.ActivityInfoDOExample;
import com.example.nanqiao.dao.mapper.ActivityInfoMapper;
import com.example.nanqiao.dao.repository.ActivityInfoDAO;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: coco
 * @Date: 2022/9/15
 **/
@Repository
public class ActivityInfoDAOImpl implements ActivityInfoDAO {
    @Resource
    private ActivityInfoMapper activityInfoMapper;
    @Override
    public void createActivityInfo(ActivityInfoDO activityInfoDO) {
        Date now=new Date();
        activityInfoDO.setGmtCreate(now);
        activityInfoDO.setGmtModified(now);
        activityInfoMapper.insertSelective(activityInfoDO);
    }

    @Override
    public ActivityInfoDO selectByUk(String activityId) {
        ActivityInfoDOExample activityInfoDOExample=new ActivityInfoDOExample();
        activityInfoDOExample.createCriteria().andActivityIdEqualTo(activityId);
        List<ActivityInfoDO> activityInfoList=activityInfoMapper.selectByExampleWithBLOBs(activityInfoDOExample);
        return CollectionUtils.isEmpty(activityInfoList)?null:activityInfoList.get(0);
    }
}
