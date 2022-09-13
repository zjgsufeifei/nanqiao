package com.example.nanqiao.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author smile
 **/
@Getter
@AllArgsConstructor
public enum ContentTypeEnum {
    BANNER(1, "banner", "banner"),
    ACTIVITY_SHOW(2, "活动风采展示", "activity_show"),
    ;

    private final Integer code;
    private final String desc;
    /**
     * 资源存放目录
     */
    private final String dir;
}
