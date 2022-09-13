package com.example.nanqiao.common.vo;

import lombok.Data;

/**
 * @author smile
 */
@Data
public class ContentVO {
    private Long id;

    private Integer type;

    private String name;

    private String filePath;

    private Long parentId;
}
