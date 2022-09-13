package com.example.nanqiao.common.request.content;

import com.example.nanqiao.common.request.PageRequest;
import lombok.Data;

/**
 * @author smile
 */
@Data
public class ContentQueryRequest extends PageRequest {
    private Long catalogId;
}
