package com.example.nanqiao.common.request.activity;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: coco
 * @Date: 2022/9/15
 **/
@Data
public class ActivityDetailInfoRequest implements Serializable {
    private static final long serialVersionUID = -2709250119029770917L;
    @NotNull(message = "活动ID不能为空")
    private String activityId;
}
