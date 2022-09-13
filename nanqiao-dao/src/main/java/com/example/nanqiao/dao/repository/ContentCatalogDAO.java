package com.example.nanqiao.dao.repository;

import com.example.nanqiao.common.enums.ContentCatalogTypeEnum;
import com.example.nanqiao.dao.entity.ContentCatalog;

import java.util.List;

/**
 * @author smile
 */
public interface ContentCatalogDAO {
    boolean add(ContentCatalog record);

    boolean update(ContentCatalog record);

    List<ContentCatalog> list(ContentCatalogTypeEnum catalogType);
}
