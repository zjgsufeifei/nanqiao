package com.example.nanqiao.common.request.content;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author smile
 */
@Data
public class ContentUpdateRequest extends ContentAddRequest {
    @NotNull(message = "内容ID不能为空")
    private Long id;

    private Integer isDeleted;
}
