package com.example.nanqiao.common.request.content;

import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author smile
 */
@Data
public class ContentAddRequest extends BaseRequest {
    @NotNull(message = "内容文件不能为空")
    private String filePath;

    @NotNull(message = "类目ID不能为空")
    private Long catalogId;
}
