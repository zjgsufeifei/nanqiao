package com.example.nanqiao.common.request.content;

import com.example.nanqiao.common.request.PageRequest;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author smile
 */
@Data
public class ContentQueryRequest extends PageRequest {
    @NotNull(message = "类目ID不能为空")
    private Long catalogId;
}
