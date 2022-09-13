package com.example.nanqiao.dao.repository.impl;

import com.example.nanqiao.common.enums.ContentCatalogTypeEnum;
import com.example.nanqiao.dao.entity.ContentCatalog;
import com.example.nanqiao.dao.entity.ContentCatalogExample;
import com.example.nanqiao.dao.mapper.ContentCatalogMapper;
import com.example.nanqiao.dao.repository.ContentCatalogDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author smile
 */
@Repository
public class ContentCatalogDAOImpl implements ContentCatalogDAO {
    @Autowired
    private ContentCatalogMapper mapper;

    @Override
    public boolean add(ContentCatalog record) {
        return mapper.insertSelective(record) > 0;
    }

    @Override
    public boolean update(ContentCatalog record) {
        return mapper.updateByPrimaryKeySelective(record) > 0;
    }

    @Override
    public List<ContentCatalog> list(ContentCatalogTypeEnum catalogType) {
        ContentCatalogExample example = new ContentCatalogExample();
        example.setOrderByClause("name");
        example.createCriteria().andTypeEqualTo(catalogType.getCode()).andIsDeletedEqualTo(0);
        return mapper.selectByExample(example);
    }
}
