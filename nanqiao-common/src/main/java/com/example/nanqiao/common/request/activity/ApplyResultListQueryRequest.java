package com.example.nanqiao.common.request.activity;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
@Data
public class ApplyResultListQueryRequest implements Serializable {
    private static final long serialVersionUID = -575750544300474652L;
    @NotNull(message = "活动ID不能为空")
    private String activityId;
    /**
     * 审核状态 0-待审核 10-审核通过报名成功 20-审核拒绝报名失败 99-活动已结束
     */
    private Integer applyStatus;
    @Min(value = 1)
    private Integer pageNumber=1;
    @Max(value = 20)
    private Integer pageSize=10;
}
