package com.example.nanqiao.common.request.file;

import com.example.nanqiao.common.enums.ContentCatalogTypeEnum;
import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

/**
 * @author smile
 */
@Data
public class FileUploadRequest extends BaseRequest {
    private ContentCatalogTypeEnum type;
}
