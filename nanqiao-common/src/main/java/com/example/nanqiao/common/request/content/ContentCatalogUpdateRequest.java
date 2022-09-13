package com.example.nanqiao.common.request.content;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author smile
 */
@Data
public class ContentCatalogUpdateRequest extends ContentCatalogAddRequest {
    @NotNull(message = "类目ID不能为空")
    private Long id;

    private Integer isDeleted;
}
