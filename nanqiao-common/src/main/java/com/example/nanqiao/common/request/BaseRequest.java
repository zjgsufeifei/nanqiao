package com.example.nanqiao.common.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@Data
public class BaseRequest implements Serializable {
    private static final long serialVersionUID = -3709164239279372041L;

    @ApiModelProperty(value = "小程序用户id")
    private String openId;
}
