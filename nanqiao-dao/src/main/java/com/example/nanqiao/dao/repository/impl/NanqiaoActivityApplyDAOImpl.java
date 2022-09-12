package com.example.nanqiao.dao.repository.impl;

import com.example.nanqiao.common.enums.ActivityApplyStatusEnum;
import com.example.nanqiao.common.error.BaseException;
import com.example.nanqiao.common.error.NanQiaoErrorCode;
import com.example.nanqiao.dao.bo.ActivityApplyBO;
import com.example.nanqiao.dao.bo.ActivityApplyUk;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDO;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDOExample;
import com.example.nanqiao.dao.mapper.NanqiaoActivityApplyMapper;
import com.example.nanqiao.dao.repository.NanqiaoActivityApplyDAO;
import org.apache.commons.lang3.ObjectUtils;
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
    public List<NanqiaoActivityApplyDO> queryActivityApplyInfo(ActivityApplyUk activityApplyUk) {
        NanqiaoActivityApplyDOExample applyDOExample=new NanqiaoActivityApplyDOExample();
        applyDOExample.createCriteria().andOpenIdEqualTo(activityApplyUk.getOpenId()).andActivityIdEqualTo(activityApplyUk.getActivityId());
        return nanqiaoActivityApplyMapper.selectByExample(applyDOExample);
    }

    @Override
    public void applyActivity(ActivityApplyUk activityApplyUk, ActivityApplyBO activityApplyBO) {
        NanqiaoActivityApplyDO newActivityApply=new NanqiaoActivityApplyDO();
        newActivityApply.setOpenId(activityApplyUk.getOpenId());
        newActivityApply.setActivityId(activityApplyUk.getActivityId());
        newActivityApply.setUserName(activityApplyBO.getUserName());
        newActivityApply.setPhone(activityApplyBO.getPhone());
        newActivityApply.setAge(activityApplyBO.getAge());
        newActivityApply.setSex(activityApplyBO.getSex());
        newActivityApply.setNumber(activityApplyBO.getNumber());
        newActivityApply.setEmail(activityApplyBO.getEmail());
        newActivityApply.setApplyStatus(ActivityApplyStatusEnum.AUDITING.getCode());
        newActivityApply.setVersion(1);
        Date now=new Date();
        newActivityApply.setGmtCreate(now);
        newActivityApply.setGmtModified(now);
        nanqiaoActivityApplyMapper.insertSelective(newActivityApply);
    }

    @Override
    public void updateApplyStatus(ActivityApplyUk activityApplyUk, ActivityApplyStatusEnum applyStatus) {
        NanqiaoActivityApplyDOExample updateExample = new NanqiaoActivityApplyDOExample();
        updateExample.createCriteria().andOpenIdEqualTo(activityApplyUk.getOpenId()).andActivityIdEqualTo(activityApplyUk.getActivityId()).andApplyStatusEqualTo(ActivityApplyStatusEnum.AUDITING.getCode());
        NanqiaoActivityApplyDO toUpdate=new NanqiaoActivityApplyDO();
        toUpdate.setApplyStatus(applyStatus.getCode());
        nanqiaoActivityApplyMapper.updateByExampleSelective(toUpdate, updateExample);
    }
}
