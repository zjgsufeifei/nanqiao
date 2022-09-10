package com.example.nanqiao.dao.bo;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@Data
@Builder
public class ActivityApplyBO {
    private String userName;

    private String phone;

    private Integer age;

    private Integer number;

    private String email;
}
