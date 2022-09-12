package com.example.nanqiao.common.request.content;

import lombok.Data;

/**
 * @author smile
 */
@Data
public class ContentUpdateRequest extends ContentAddRequest {
    private Long id;

    private Integer isDeleted;
}
