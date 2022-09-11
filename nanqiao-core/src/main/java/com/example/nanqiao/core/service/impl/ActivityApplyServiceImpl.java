package com.example.nanqiao.core.service.impl;

import com.example.nanqiao.common.enums.ActivityApplyStatusEnum;
import com.example.nanqiao.common.error.BaseException;
import com.example.nanqiao.common.error.NanQiaoErrorCode;
import com.example.nanqiao.common.request.activity.ApplyAuditRequest;
import com.example.nanqiao.common.request.activity.ApplyCreateRequest;
import com.example.nanqiao.common.util.MobileUtils;
import com.example.nanqiao.core.service.ActivityApplyService;
import com.example.nanqiao.dao.bo.ActivityApplyBO;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDO;
import com.example.nanqiao.dao.repository.NanqiaoActivityApplyDAO;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@Service
public class ActivityApplyServiceImpl implements ActivityApplyService {
    @Resource
    private NanqiaoActivityApplyDAO nanqiaoActivityApplyDAO;
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
        List<NanqiaoActivityApplyDO> nanqiaoActivityApplyLst=nanqiaoActivityApplyDAO.queryActivityApplyInfo(request.getOpenId(), request.getActivityId());
        if(CollectionUtils.isNotEmpty(nanqiaoActivityApplyLst)){
            throw new BaseException(NanQiaoErrorCode.ALREADY_APPLY_ACTIVITY);
        }
        ActivityApplyBO activityApplyBO=ActivityApplyBO.builder().userName(request.getUserName()).phone(request.getPhone()).number(request.getUserNumber()).age(request.getAge()).sex(request.getSex()).email(request.getEmail()).build();
        nanqiaoActivityApplyDAO.applyActivity(request.getOpenId(), request.getActivityId(), activityApplyBO);
    }

    @Override
    public void auditApply(ApplyAuditRequest request) {
        // TODO: 2022/9/11 查询活动信息
        Date activityEndTime = new Date();
        Date now = new Date();

        if (now.after(activityEndTime)) {
            nanqiaoActivityApplyDAO.updateApplyStatus(request.getOpenId(), request.getActivityId(), ActivityApplyStatusEnum.ACTIVITY_ENDED);
            //告诉前端审核失败
        }

        //看人数
        //TODO.

        //事务更改
        //1。人数+1
        //2。更改状态
        ActivityApplyStatusEnum auditResult = request.getAuditResult() == 1 ? ActivityApplyStatusEnum.APPLY_SUCCESS : ActivityApplyStatusEnum.APPLY_FAILED;
        nanqiaoActivityApplyDAO.updateApplyStatus(request.getOpenId(), request.getActivityId(), auditResult);
    }
}
