package com.example.nanqiao.common.request;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author smile
 */
@Data
public class PageRequest extends BaseRequest {
    @Min(value = 1, message = "页码不小于1")
    @Max(value = 100, message = "页码不大于100")
    private Integer pageNum;

    @Min(value = 1, message = "每页数据不小于1")
    @Max(value = 100, message = "每页数据不大于100")
    private Integer pageSize;
}
