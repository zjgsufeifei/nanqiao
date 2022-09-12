package com.example.nanqiao.dao.repository.impl;

import com.alibaba.fastjson2.JSON;
import com.example.nanqiao.common.constants.BusinessConstant;
import com.example.nanqiao.dao.bo.ActivityStatisticsBO;
import com.example.nanqiao.dao.entity.ActivityApplyStatisticsDO;
import com.example.nanqiao.dao.entity.ActivityApplyStatisticsDOExample;
import com.example.nanqiao.dao.mapper.ActivityApplyStatisticsMapper;
import com.example.nanqiao.dao.mapper.manual.ActivityApplyStatisticsManualMapper;
import com.example.nanqiao.dao.repository.ActivityApplyStatisticsDAO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
@Repository
public class ActivityApplyStatisticsDAOImpl implements ActivityApplyStatisticsDAO {
    @Resource
    private ActivityApplyStatisticsMapper activityApplyStatisticsMapper;
    @Resource
    private ActivityApplyStatisticsManualMapper activityApplyStatisticsManualMapper;
    @Override
    public ActivityApplyStatisticsDO selectApplyStatisticsByUk(Long activityId) {
        ActivityApplyStatisticsDOExample statisticsDOExample=new ActivityApplyStatisticsDOExample();
        statisticsDOExample.createCriteria().andActivityIdEqualTo(activityId);
        List<ActivityApplyStatisticsDO> activityApplyStatisticsList=activityApplyStatisticsMapper.selectByExample(statisticsDOExample);
        return CollectionUtils.isEmpty(activityApplyStatisticsList)?null:activityApplyStatisticsList.get(0);
    }

    @Override
    @Transactional(transactionManager = BusinessConstant.TRANSACTION_MANAGER_NAME)
    public void recordActivityStatistics(Long activityId, String activityName, ActivityStatisticsBO activityStatisticsBO){
        ActivityApplyStatisticsDOExample statisticsDOExample=new ActivityApplyStatisticsDOExample();
        statisticsDOExample.createCriteria().andActivityIdEqualTo(activityId);
        List<ActivityApplyStatisticsDO> activityApplyStatisticsList=activityApplyStatisticsManualMapper.selectByActivityIdForUpdate(statisticsDOExample);
        if(CollectionUtils.isEmpty(activityApplyStatisticsList)){
            ActivityApplyStatisticsDO initApplyStatisticsDO=new ActivityApplyStatisticsDO();
            initApplyStatisticsDO.setActivityId(activityId);
            initApplyStatisticsDO.setActivityName(activityName);
            initApplyStatisticsDO.setMaleNumber(BooleanUtils.isTrue(activityStatisticsBO.getMale())?1:0);
            initApplyStatisticsDO.setFemaleNumber(BooleanUtils.isTrue(activityStatisticsBO.getFemale())?1:0);
            if(BooleanUtils.isTrue(activityStatisticsBO.getApply())){
                initApplyStatisticsDO.setApplyNumber(activityStatisticsBO.getApplyNumber());
            }
            if(BooleanUtils.isTrue(activityStatisticsBO.getApplySuccess())){
                initApplyStatisticsDO.setApplySuccessNumber(activityStatisticsBO.getApplyNumber());
            }
            initApplyStatisticsDO.setVersion(1);
            Date now=new Date();
            initApplyStatisticsDO.setGmtCreate(now);
            initApplyStatisticsDO.setGmtModified(now);
            Map<String, Integer> ageRangeNumber=new HashMap<>();
            ageRangeNumber.put(activityStatisticsBO.getAge().toString(),1);
            initApplyStatisticsDO.setAgeRange(JSON.toJSONString(ageRangeNumber));
            activityApplyStatisticsMapper.insertSelective(initApplyStatisticsDO);
        }else {
            ActivityApplyStatisticsDO activityApplyStatisticsCurrent =activityApplyStatisticsList.get(0);
            ActivityApplyStatisticsDO toUpdate=new ActivityApplyStatisticsDO();
            if(BooleanUtils.isTrue(activityStatisticsBO.getApplySuccess())){
                toUpdate.setApplySuccessNumber(activityApplyStatisticsCurrent.getApplySuccessNumber()+activityStatisticsBO.getApplyNumber());
            }else {
                if(BooleanUtils.isTrue(activityStatisticsBO.getMale())){
                    toUpdate.setMaleNumber(activityApplyStatisticsCurrent.getMaleNumber()+1);
                }
                if(BooleanUtils.isTrue(activityStatisticsBO.getFemale())){
                    toUpdate.setMaleNumber(activityApplyStatisticsCurrent.getFemaleNumber()+1);
                }
                if(BooleanUtils.isTrue(activityStatisticsBO.getApply())){
                    toUpdate.setApplyNumber(activityApplyStatisticsCurrent.getApplyNumber()+activityStatisticsBO.getApplyNumber());
                }
                Integer age=activityStatisticsBO.getAge();
                if(Objects.nonNull(age)){
                    String ageRange=activityApplyStatisticsCurrent.getAgeRange();
                    Map<String,Integer> ageRangeMap=new HashMap<>();
                    if(StringUtils.isBlank(ageRange)){
                        ageRangeMap.put(age.toString(),1);
                    }else {
                        ageRangeMap=JSON.parseObject(ageRange,Map.class);
                        Integer number=ageRangeMap.get(age.toString());
                        if(Objects.isNull(number)){
                            ageRangeMap.put(age.toString(),1);
                        }else {
                            ageRangeMap.put(age.toString(),number+1);
                        }
                    }
                    toUpdate.setAgeRange(JSON.toJSONString(ageRangeMap));
                }
            }
            toUpdate.setVersion(activityApplyStatisticsCurrent.getVersion()+1);
            toUpdate.setGmtModified(new Date());

            activityApplyStatisticsMapper.updateByExampleSelective(toUpdate,statisticsDOExample);
        }
    }
}
