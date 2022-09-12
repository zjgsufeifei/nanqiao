package com.example.nanqiao.common.request.activity;

import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
@Data
public class ApplyResultDetailQueryRequest extends BaseRequest {
    private static final long serialVersionUID = -6668029156215170989L;
    @NotNull(message = "活动ID不能为空")
    private Long activityId;
}
