package com.example.nanqiao.core.service;

import com.example.nanqiao.common.request.content.ContentAddRequest;
import com.example.nanqiao.common.request.content.ContentQueryRequest;
import com.example.nanqiao.common.request.content.ContentUpdateRequest;
import com.example.nanqiao.common.response.PageResult;
import com.example.nanqiao.common.vo.ContentVO;

/**
 * @author smile
 */
public interface ContentService {
    boolean add(ContentAddRequest request);

    boolean update(ContentUpdateRequest request);

    PageResult<ContentVO> list(ContentQueryRequest request);
}
