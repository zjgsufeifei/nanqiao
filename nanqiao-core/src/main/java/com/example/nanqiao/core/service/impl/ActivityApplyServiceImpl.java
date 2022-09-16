package com.example.nanqiao.core.service.impl;

import com.example.nanqiao.common.dto.ApplyDetailDTO;
import com.example.nanqiao.common.enums.ActivityApplyStatusEnum;
import com.example.nanqiao.common.error.BaseException;
import com.example.nanqiao.common.error.NanQiaoErrorCode;
import com.example.nanqiao.common.request.activity.ApplyAuditRequest;
import com.example.nanqiao.common.request.activity.ApplyCreateRequest;
import com.example.nanqiao.common.request.activity.ApplyResultDetailQueryRequest;
import com.example.nanqiao.common.request.activity.ApplyResultListQueryRequest;
import com.example.nanqiao.common.response.activity.ApplyListResponse;
import com.example.nanqiao.common.response.activity.ApplyResultQueryResponse;
import com.example.nanqiao.common.util.MobileUtils;
import com.example.nanqiao.core.service.ActivityApplyService;
import com.example.nanqiao.dao.bo.ActivityApplyBO;
import com.example.nanqiao.dao.bo.ActivityApplyUk;
import com.example.nanqiao.dao.bo.ActivityStatisticsBO;
import com.example.nanqiao.dao.entity.ActivityApplyStatisticsDO;
import com.example.nanqiao.dao.entity.ActivityInfoDO;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDO;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDOExample;
import com.example.nanqiao.dao.mapper.NanqiaoActivityApplyMapper;
import com.example.nanqiao.dao.repository.ActivityApplyStatisticsDAO;
import com.example.nanqiao.dao.repository.ActivityInfoDAO;
import com.example.nanqiao.dao.repository.NanqiaoActivityApplyDAO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
    @Resource
    private NanqiaoActivityApplyMapper nanqiaoActivityApplyMapper;
    @Resource
    private ActivityInfoDAO activityInfoDAO;

    @Override
    public void createApply(ApplyCreateRequest request) {
        if(StringUtils.isBlank(request.getOpenId())){
            throw new BaseException(NanQiaoErrorCode.PARAM_ILLEGAL,"用户信息缺失");
        }
        MobileUtils.checkMobile(request.getPhone());
        ActivityInfoDO activityInfoDO =activityInfoDAO.selectByUk(request.getActivityId());
        if(Objects.isNull(activityInfoDO)){
            throw new BaseException(NanQiaoErrorCode.ACTIVITY_NOT_EXIST);
        }
        Date activityStartTime=activityInfoDO.getStartTime();
        Date now=new Date();
        if(activityStartTime.before(now)){
            throw new BaseException(NanQiaoErrorCode.ACTIVITY_STARTED);
        }
        String activityId= activityInfoDO.getActivityId();
        String activityName=activityInfoDO.getTitle();
        ActivityApplyUk activityApplyUk=ActivityApplyUk.builder().openId(request.getOpenId()).activityId(activityId).build();
        List<NanqiaoActivityApplyDO> nanqiaoActivityApplyList=nanqiaoActivityApplyDAO.queryActivityApplyInfo(activityApplyUk);
        if(CollectionUtils.isNotEmpty(nanqiaoActivityApplyList)){
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
        activityStatisticsBO.setApplyNumber(request.getUserNumber());
        activityApplyStatisticsDAO.recordActivityStatistics(activityId,activityName,activityStatisticsBO);
    }

    @Override
    public void auditApply(ApplyAuditRequest request) {
        String activityId= request.getActivityId();
        String openId= request.getOpenId();
        ActivityInfoDO activityInfoDO =activityInfoDAO.selectByUk(request.getActivityId());
        if(Objects.isNull(activityInfoDO)){
            throw new BaseException(NanQiaoErrorCode.ACTIVITY_NOT_EXIST);
        }
        Date activityStartTime = activityInfoDO.getStartTime();
        Integer limitNumber=0;
        String activityName="";

        Date now = new Date();
        ActivityApplyUk activityApplyUk=ActivityApplyUk.builder().openId(openId).activityId(activityId).build();
        List<NanqiaoActivityApplyDO> nanqiaoActivityApplyList=nanqiaoActivityApplyDAO.queryActivityApplyInfo(activityApplyUk);
        if(CollectionUtils.isEmpty(nanqiaoActivityApplyList)) throw new BaseException(NanQiaoErrorCode.APPLY_NOT_EXIST);
        if(Objects.equals(request.getAuditResult(),2)){
            nanqiaoActivityApplyDAO.updateApplyStatus(activityApplyUk, ActivityApplyStatusEnum.APPLY_FAILED, request.getAuditor());
            return;
        }

        if (now.after(activityStartTime)) {
            nanqiaoActivityApplyDAO.updateApplyStatus(activityApplyUk, ActivityApplyStatusEnum.ACTIVITY_ENDED, request.getAuditor());
            //弹窗告知活动已结束
            throw new BaseException(NanQiaoErrorCode.ACTIVITY_STARTED);
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
        activityStatisticsBO.setApplyNumber(nanqiaoActivityApplyList.get(0).getNumber());
        activityApplyStatisticsDAO.recordActivityStatistics(activityId,activityName,activityStatisticsBO);
    }

    @Override
    public ApplyResultQueryResponse queryApplyDetail(ApplyResultDetailQueryRequest request) {
        ActivityApplyUk activityApplyUk=ActivityApplyUk.builder().openId(request.getOpenId()).activityId(request.getActivityId()).build();
        List<NanqiaoActivityApplyDO> nanqiaoActivityApplyList=nanqiaoActivityApplyDAO.queryActivityApplyInfo(activityApplyUk);
        if(CollectionUtils.isEmpty(nanqiaoActivityApplyList)){
            return null;
        }
        NanqiaoActivityApplyDO activityApply=nanqiaoActivityApplyList.get(0);
        ApplyDetailDTO applyDetailDTO=ApplyDetailDTO.builder().userName(activityApply.getUserName()).userNumber(activityApply.getNumber())
                .phone(activityApply.getPhone()).age(activityApply.getAge()).sex(activityApply.getSex())
                .email(activityApply.getEmail()).applyTime(activityApply.getGmtCreate()).openId(activityApplyUk.getOpenId()).build();
        return ApplyResultQueryResponse.builder().applyStatus(activityApply.getApplyStatus()).applyDetail(applyDetailDTO).build();
    }

    @Override
    public ApplyListResponse queryApplyList(ApplyResultListQueryRequest request) {
        NanqiaoActivityApplyDOExample applyDOExample=new NanqiaoActivityApplyDOExample();
        NanqiaoActivityApplyDOExample.Criteria criteria =applyDOExample.createCriteria();
        criteria.andActivityIdEqualTo(request.getActivityId());
        if(Objects.nonNull(request.getApplyStatus())){
            criteria.andApplyStatusEqualTo(request.getApplyStatus());
        }
        applyDOExample.setOrderByClause("gmt_create desc");
        RowBounds rowBounds=new RowBounds((request.getPageNumber()-1)*request.getPageSize(),request.getPageSize());
        List<NanqiaoActivityApplyDO> nanqiaoActivityApplyList=nanqiaoActivityApplyMapper.selectByExampleWithRowbounds(applyDOExample,rowBounds);
        if(CollectionUtils.isEmpty(nanqiaoActivityApplyList)){
            return null;
        }
        List<ApplyDetailDTO> applyDetailList=nanqiaoActivityApplyList.stream().map(activityApply->{
            ApplyDetailDTO applyDetailDTO=ApplyDetailDTO.builder().userName(activityApply.getUserName()).userNumber(activityApply.getNumber())
                    .phone(activityApply.getPhone()).age(activityApply.getAge()).sex(activityApply.getSex())
                    .email(activityApply.getEmail()).applyTime(activityApply.getGmtCreate()).openId(activityApply.getOpenId()).build();
            return applyDetailDTO;
        }).collect(Collectors.toList());
        ApplyListResponse applyListResponse=new ApplyListResponse();
        applyListResponse.setApplyList(applyDetailList);
        return applyListResponse;
    }
}
