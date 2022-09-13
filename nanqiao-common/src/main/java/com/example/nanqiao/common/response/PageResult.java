package com.example.nanqiao.common.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author smile
 */
@Builder
@Data
public class PageResult<T> {
    private List<T> list;
    private Long total;
}
