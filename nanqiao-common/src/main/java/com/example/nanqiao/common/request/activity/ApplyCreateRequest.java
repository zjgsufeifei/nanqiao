package com.example.nanqiao.common.request.activity;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/

import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 活动报名请求
 */
@Data
public class ApplyCreateRequest extends BaseRequest {
    private static final long serialVersionUID = -8391755372898697767L;
    @NotNull(message = "活动ID不能为空")
    private Long activityId;
    @NotNull(message = "报名姓名不能为空")
    private String userName;
    @NotNull(message = "报名手机号不能为空")
    private String phone;
    @NotNull(message = "年龄不能为空")
    private Integer age;
    @NotNull(message = "性别不能为空")
    private Integer sex;
    @NotNull(message = "报名人数不能为空")
    private Integer userNumber;
    private String email;
}
