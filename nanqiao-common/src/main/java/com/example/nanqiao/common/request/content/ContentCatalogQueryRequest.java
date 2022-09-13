package com.example.nanqiao.common.request.content;

import com.example.nanqiao.common.enums.ContentCatalogTypeEnum;
import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author smile
 */
@Data
public class ContentCatalogQueryRequest extends BaseRequest {
    @NotNull(message = "类目类型不能为空")
    private ContentCatalogTypeEnum type;
}
