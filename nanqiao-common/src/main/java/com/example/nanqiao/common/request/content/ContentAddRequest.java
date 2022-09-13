package com.example.nanqiao.common.request.content;

import com.example.nanqiao.common.enums.ContentTypeEnum;
import com.example.nanqiao.common.request.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author smile
 */
@Data
public class ContentAddRequest extends BaseRequest {
    @ApiModelProperty("类型")
    private ContentTypeEnum type;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("文件路径")
    private String filePath;

    @ApiModelProperty("父ID")
    private Long parentId;
}
