package com.example.nanqiao.dao.mapper;

import com.example.nanqiao.dao.entity.ContentCatalog;
import com.example.nanqiao.dao.entity.ContentCatalogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContentCatalogMapper {
    long countByExample(ContentCatalogExample example);

    int deleteByExample(ContentCatalogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContentCatalog record);

    int insertSelective(ContentCatalog record);

    List<ContentCatalog> selectByExampleWithRowbounds(ContentCatalogExample example, RowBounds rowBounds);

    List<ContentCatalog> selectByExample(ContentCatalogExample example);

    ContentCatalog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContentCatalog record, @Param("example") ContentCatalogExample example);

    int updateByExample(@Param("record") ContentCatalog record, @Param("example") ContentCatalogExample example);

    int updateByPrimaryKeySelective(ContentCatalog record);

    int updateByPrimaryKey(ContentCatalog record);
}