package com.example.nanqiao.common.request.file;

import com.example.nanqiao.common.enums.ContentTypeEnum;
import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author smile
 */
@Data
public class FileUploadRequest extends BaseRequest {
    @NotNull(message = "类目类型不能为空")
    private ContentTypeEnum type;
}
