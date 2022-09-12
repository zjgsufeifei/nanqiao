package com.example.nanqiao.dao.bo;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
@Data
@Builder
public class ActivityApplyUk {
    private String openId;
    private Long activityId;
}
