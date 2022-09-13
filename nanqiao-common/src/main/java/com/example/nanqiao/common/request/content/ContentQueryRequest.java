package com.example.nanqiao.common.request.content;

import com.example.nanqiao.common.enums.ContentTypeEnum;
import com.example.nanqiao.common.request.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author smile
 */
@Data
public class ContentQueryRequest extends PageRequest {
    @ApiModelProperty("类型")
    private ContentTypeEnum type;

    @ApiModelProperty("父ID")
    private Long parentId;
}
