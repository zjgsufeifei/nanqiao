package com.example.nanqiao.dao.bo;

import lombok.Data;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
@Data
public class ActivityStatisticsBO {
    private Boolean male;
    private Boolean female;
    private Boolean apply;
    private Boolean applySuccess;
    private Integer age;
}
