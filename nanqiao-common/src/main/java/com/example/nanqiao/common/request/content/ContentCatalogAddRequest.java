package com.example.nanqiao.common.request.content;

import com.example.nanqiao.common.enums.ContentCatalogTypeEnum;
import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

/**
 * @author smile
 */
@Data
public class ContentCatalogAddRequest extends BaseRequest {
    private ContentCatalogTypeEnum type;

    private String name;

    private String coverImg;
}
