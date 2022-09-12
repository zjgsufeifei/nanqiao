package com.example.nanqiao.common.dto;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 报名详情
 */
@Data
@Builder
public class ApplyDetailDTO implements Serializable {
    private static final long serialVersionUID = -3275891904544994746L;
    /**
     * 报名时间
     */
    private Date applyTime;
    /**
     * 报名姓名
     */
    private String userName;
    /**
     * 报名手机号
     */
    private String phone;
    /**
     * 报名年龄
     */
    private Integer age;
    /**
     * 报名性别 1-男 2-女
     */
    private Integer sex;
    /**
     * 报名人数
     */
    private Integer userNumber;
    private String email;
}
