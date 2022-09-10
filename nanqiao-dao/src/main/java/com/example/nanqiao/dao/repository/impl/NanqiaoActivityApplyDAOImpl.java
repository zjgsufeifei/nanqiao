package com.example.nanqiao.dao.repository.impl;

import com.example.nanqiao.common.enums.ActivityApplyStatusEnum;
import com.example.nanqiao.dao.bo.ActivityApplyBO;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDO;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDOExample;
import com.example.nanqiao.dao.mapper.NanqiaoActivityApplyMapper;
import com.example.nanqiao.dao.repository.NanqiaoActivityApplyDAO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@Repository
public class NanqiaoActivityApplyDAOImpl implements NanqiaoActivityApplyDAO {
    @Resource
    private NanqiaoActivityApplyMapper nanqiaoActivityApplyMapper;
    @Override
    public List<NanqiaoActivityApplyDO> queryActivityApplyInfo(String openId, Long activityId) {
        NanqiaoActivityApplyDOExample applyDOExample=new NanqiaoActivityApplyDOExample();
        applyDOExample.createCriteria().andOpenIdEqualTo(openId).andActivityIdEqualTo(activityId);
        return nanqiaoActivityApplyMapper.selectByExample(applyDOExample);
    }

    @Override
    public void applyActivity(String openId, Long activityId, ActivityApplyBO activityApplyBO) {
        NanqiaoActivityApplyDO newActivityApply=new NanqiaoActivityApplyDO();
        newActivityApply.setOpenId(openId);
        newActivityApply.setActivityId(activityId);
        newActivityApply.setUserName(activityApplyBO.getUserName());
        newActivityApply.setPhone(activityApplyBO.getPhone());
        newActivityApply.setAge(activityApplyBO.getAge());
        newActivityApply.setNumber(activityApplyBO.getNumber());
        newActivityApply.setEmail(activityApplyBO.getEmail());
        newActivityApply.setApplyStatus(ActivityApplyStatusEnum.AUDITING.getCode());
        newActivityApply.setVersion(1);
        Date now=new Date();
        newActivityApply.setGmtCreate(now);
        newActivityApply.setGmtModified(now);
        nanqiaoActivityApplyMapper.insertSelective(newActivityApply);
    }
}
