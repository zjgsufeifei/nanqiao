package com.example.nanqiao.core.service;

import com.example.nanqiao.common.enums.ContentCatalogTypeEnum;
import com.example.nanqiao.common.request.content.ContentCatalogAddRequest;
import com.example.nanqiao.common.request.content.ContentCatalogUpdateRequest;
import com.example.nanqiao.dao.entity.ContentCatalog;

import java.util.List;

/**
 * @author smile
 */
public interface ContentCatalogService {
    boolean add(ContentCatalogAddRequest request);

    boolean update(ContentCatalogUpdateRequest request);

    List<ContentCatalog> list(ContentCatalogTypeEnum type);
}
