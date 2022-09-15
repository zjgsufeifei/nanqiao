package com.example.nanqiao.common.response.activity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: coco
 * @Date: 2022/9/15
 **/
@Data
@Builder
public class CreateActivityResponse implements Serializable {
    private static final long serialVersionUID = 2213502126509882684L;
    /**
     * 活动ID
     */
    private String activityId;
}
