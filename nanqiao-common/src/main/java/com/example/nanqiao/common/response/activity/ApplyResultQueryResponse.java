package com.example.nanqiao.common.response.activity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
@Data
@Builder
public class ApplyResultQueryResponse implements Serializable {
    private static final long serialVersionUID = 4502244314588417585L;
    /**
     * 报名状态 0-审核中 10-报名成功 20-报名失败 99-活动已结束 如果审核中&活动已结束，展示活动结束
     */
    private Integer applyStatus;
    /**
     * 报名时间
     */
    private Date applyTime;
}
