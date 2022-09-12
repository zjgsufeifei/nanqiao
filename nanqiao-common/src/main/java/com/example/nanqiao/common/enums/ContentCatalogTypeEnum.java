package com.example.nanqiao.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author smile
 **/
@Getter
@AllArgsConstructor
public enum ContentCatalogTypeEnum {
    BANNER(1, "banner"),
    ACTIVITY_SHOW(100, "活动风采展示"),
    ;

    private final Integer code;
    private final String desc;

}
