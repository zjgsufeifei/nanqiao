package com.example.nanqiao.common.request.content;

import com.example.nanqiao.common.request.BaseRequest;
import lombok.Data;

/**
 * @author smile
 */
@Data
public class ContentAddRequest extends BaseRequest {
    private String filePath;

    private Long catalogId;
}
