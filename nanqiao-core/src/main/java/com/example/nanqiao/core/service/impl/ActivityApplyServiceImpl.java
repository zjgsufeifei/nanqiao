package com.example.nanqiao.core.service.impl;

import com.example.nanqiao.common.enums.ActivityApplyStatusEnum;
import com.example.nanqiao.common.error.BaseException;
import com.example.nanqiao.common.error.NanQiaoErrorCode;
import com.example.nanqiao.common.request.activity.ApplyAuditRequest;
import com.example.nanqiao.common.request.activity.ApplyCreateRequest;
import com.example.nanqiao.common.request.activity.ApplyResultQueryRequest;
import com.example.nanqiao.common.response.activity.ApplyResultQueryResponse;
import com.example.nanqiao.common.util.MobileUtils;
import com.example.nanqiao.core.service.ActivityApplyService;
import com.example.nanqiao.dao.bo.ActivityApplyBO;
import com.example.nanqiao.dao.bo.ActivityApplyUk;
import com.example.nanqiao.dao.bo.ActivityStatisticsBO;
import com.example.nanqiao.dao.entity.ActivityApplyStatisticsDO;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDO;
import com.example.nanqiao.dao.repository.ActivityApplyStatisticsDAO;
import com.example.nanqiao.dao.repository.NanqiaoActivityApplyDAO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@Service
public class ActivityApplyServiceImpl implements ActivityApplyService {
    @Resource
    private NanqiaoActivityApplyDAO nanqiaoActivityApplyDAO;
    @Resource
    private ActivityApplyStatisticsDAO activityApplyStatisticsDAO;

    @Override
    public void createApply(ApplyCreateRequest request) {
        if(StringUtils.isBlank(request.getOpenId())){
            throw new BaseException(NanQiaoErrorCode.PARAM_ILLEGAL,"用户信息缺失");
        }
        MobileUtils.checkMobile(request.getPhone());
        // TODO: 2022/9/10 查询活动信息
        Date activityStartTime=new Date();
        Date activityEndTime=new Date();
        Date now=new Date();
        if(now.before(activityStartTime)){
            throw new BaseException(NanQiaoErrorCode.ACTIVITY_NOT_START);
        }
        if(activityEndTime.before(now)){
            throw new BaseException(NanQiaoErrorCode.ACTIVITY_ENDED);
        }
        Long activityId= request.getActivityId();
        // TODO: 2022/9/12 待补充name
        String activityName="";
        ActivityApplyUk activityApplyUk=ActivityApplyUk.builder().openId(request.getOpenId()).activityId(request.getActivityId()).build();
        List<NanqiaoActivityApplyDO> nanqiaoActivityApplyLst=nanqiaoActivityApplyDAO.queryActivityApplyInfo(activityApplyUk);
        if(CollectionUtils.isNotEmpty(nanqiaoActivityApplyLst)){
            throw new BaseException(NanQiaoErrorCode.ALREADY_APPLY_ACTIVITY);
        }
        ActivityApplyBO activityApplyBO=ActivityApplyBO.builder().userName(request.getUserName()).phone(request.getPhone()).number(request.getUserNumber()).age(request.getAge()).sex(request.getSex()).email(request.getEmail()).build();
        nanqiaoActivityApplyDAO.applyActivity(activityApplyUk,activityApplyBO);

        ActivityStatisticsBO activityStatisticsBO=new ActivityStatisticsBO();
        activityStatisticsBO.setApply(true);
        activityStatisticsBO.setAge(request.getAge());
        if(request.getSex()==1){
            activityStatisticsBO.setMale(true);
        }
        else if(request.getSex()==2){
            activityStatisticsBO.setFemale(true);
        }
        activityApplyStatisticsDAO.recordActivityStatistics(activityId,activityName,activityStatisticsBO);
    }

    @Override
    public void auditApply(ApplyAuditRequest request) {
        Long activityId= request.getActivityId();
        String openId= request.getOpenId();
        // TODO: 2022/9/11 查询活动信息
        Date activityEndTime = new Date();
        Integer limitNumber=0;
        String activityName="";

        Date now = new Date();
        ActivityApplyUk activityApplyUk=ActivityApplyUk.builder().openId(openId).activityId(activityId).build();
        List<NanqiaoActivityApplyDO> nanqiaoActivityApplyList=nanqiaoActivityApplyDAO.queryActivityApplyInfo(activityApplyUk);
        if(CollectionUtils.isEmpty(nanqiaoActivityApplyList)) throw new BaseException(NanQiaoErrorCode.APPLY_NOT_EXIST);
        if (now.after(activityEndTime)) {
            nanqiaoActivityApplyDAO.updateApplyStatus(activityApplyUk, ActivityApplyStatusEnum.ACTIVITY_ENDED, request.getAuditor());
            //告诉前端审核失败
            throw new BaseException(NanQiaoErrorCode.ACTIVITY_ENDED);
        }

        if(request.getForceAuditSuccess()==0){
            ActivityApplyStatisticsDO activityApplyStatistics =activityApplyStatisticsDAO.selectApplyStatisticsByUk(activityId);
            if(Objects.nonNull(activityApplyStatistics)&&activityApplyStatistics.getApplySuccessNumber()>limitNumber){
                throw new BaseException(NanQiaoErrorCode.EXCEED_ACTIVITY_NUMBER);
            }
        }

        //1。人数+1
        //2。更改状态
        ActivityApplyStatusEnum auditResult = request.getAuditResult() == 1 ? ActivityApplyStatusEnum.APPLY_SUCCESS : ActivityApplyStatusEnum.APPLY_FAILED;
        nanqiaoActivityApplyDAO.updateApplyStatus(ActivityApplyUk.builder().openId(request.getOpenId()).activityId(request.getActivityId()).build(), auditResult, request.getAuditor());
        ActivityStatisticsBO activityStatisticsBO=new ActivityStatisticsBO();
        activityStatisticsBO.setApplySuccess(true);
        activityApplyStatisticsDAO.recordActivityStatistics(activityId,activityName,activityStatisticsBO);
    }

    @Override
    public ApplyResultQueryResponse queryApply(ApplyResultQueryRequest request) {
        ActivityApplyUk activityApplyUk=ActivityApplyUk.builder().openId(request.getOpenId()).activityId(request.getActivityId()).build();
        List<NanqiaoActivityApplyDO> nanqiaoActivityApplyList=nanqiaoActivityApplyDAO.queryActivityApplyInfo(activityApplyUk);
        if(CollectionUtils.isEmpty(nanqiaoActivityApplyList)){
            return null;
        }
        NanqiaoActivityApplyDO nanqiaoActivityApply=nanqiaoActivityApplyList.get(0);
        return ApplyResultQueryResponse.builder().applyStatus(nanqiaoActivityApply.getApplyStatus()).applyTime(nanqiaoActivityApply.getGmtCreate()).build();
    }
}
