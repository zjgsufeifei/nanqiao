package com.example.nanqiao.api.controllers;

import com.alibaba.fastjson2.JSON;
import com.example.nanqiao.api.NanqiaoApplication;
import com.example.nanqiao.common.request.activity.ApplyAuditRequest;
import com.example.nanqiao.common.request.activity.ApplyCreateRequest;
import com.example.nanqiao.common.request.activity.ApplyResultDetailQueryRequest;
import com.example.nanqiao.common.request.activity.ApplyResultListQueryRequest;
import com.example.nanqiao.common.response.BaseResponse;
import com.example.nanqiao.common.response.activity.ApplyListResponse;
import com.example.nanqiao.common.response.activity.ApplyResultQueryResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Author: coco
 * @Date: 2022/9/11
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {NanqiaoApplication.class})
public class ActivityApplyControllerTest {
    @Resource
    private ActivityApplyController activityApplyController;
    @Test
    public void createApplyTest(){
        ApplyCreateRequest applyCreateRequest=new ApplyCreateRequest();
        applyCreateRequest.setActivityId(1L);
        applyCreateRequest.setUserName("coco");
        applyCreateRequest.setPhone("13888881111");
        applyCreateRequest.setAge(20);
        applyCreateRequest.setSex(1);
        applyCreateRequest.setUserNumber(1);
        applyCreateRequest.setEmail("llloooo@163.com");
        applyCreateRequest.setOpenId("aqxzcv2");
        activityApplyController.createApply(applyCreateRequest);
    }

    @Test
    public void queryApplyDetailTest(){
        ApplyResultDetailQueryRequest queryRequest=new ApplyResultDetailQueryRequest();
        queryRequest.setActivityId(1L);
        queryRequest.setOpenId("aqxzcv");
        BaseResponse<ApplyResultQueryResponse> applyResultQueryResponseBaseResponse=activityApplyController.queryApplyDetail(queryRequest);
        System.out.println(JSON.toJSONString(applyResultQueryResponseBaseResponse));
    }

    @Test
    public void auditApplyTest(){
        ApplyAuditRequest applyAuditRequest=new ApplyAuditRequest();
        applyAuditRequest.setActivityId(1L);
        applyAuditRequest.setAuditResult(1);
        applyAuditRequest.setOpenId("aqxzcv");
        activityApplyController.auditApply(applyAuditRequest);
    }

    @Test
    public void queryApplyListTest(){
        ApplyResultListQueryRequest request=new ApplyResultListQueryRequest();
        request.setActivityId(1L);
        request.setApplyStatus(10);
        BaseResponse<ApplyListResponse> applyListResponseBaseResponse=activityApplyController.queryApplyList(request);
        System.out.println(JSON.toJSONString(applyListResponseBaseResponse));
    }
}
