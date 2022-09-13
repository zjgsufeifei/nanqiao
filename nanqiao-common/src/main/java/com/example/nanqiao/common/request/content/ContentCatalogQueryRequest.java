package com.example.nanqiao.common.request.content;

import com.example.nanqiao.common.enums.ContentCatalogTypeEnum;
import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

/**
 * @author smile
 */
@Data
public class ContentCatalogQueryRequest extends BaseRequest {
    private ContentCatalogTypeEnum type;
}
