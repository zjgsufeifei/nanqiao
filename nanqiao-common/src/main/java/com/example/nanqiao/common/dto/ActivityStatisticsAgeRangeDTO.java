package com.example.nanqiao.common.dto;

import lombok.Data;

import java.util.Map;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
@Data
public class ActivityStatisticsAgeRangeDTO {
    /**;
     * 年龄范围数量，key:年龄,value:数量
     */
    Map<String,String> rangeMap;
}
