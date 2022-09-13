package com.example.nanqiao.dao.repository.impl;

import com.example.nanqiao.common.enums.ContentTypeEnum;
import com.example.nanqiao.dao.entity.Content;
import com.example.nanqiao.dao.entity.ContentExample;
import com.example.nanqiao.dao.mapper.ContentMapper;
import com.example.nanqiao.dao.repository.ContentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author smile
 */
@Repository
public class ContentDAOImpl implements ContentDAO {
    @Autowired
    private ContentMapper mapper;

    @Override
    public boolean add(Content record) {
        return mapper.insertSelective(record) > 0;
    }

    @Override
    public boolean update(Content record) {
        return mapper.updateByPrimaryKeySelective(record) > 0;
    }

    @Override
    public List<Content> list(ContentTypeEnum type, long parentId) {
        ContentExample example = new ContentExample();
        example.setOrderByClause("id DESC");
        ContentExample.Criteria criteria = example.createCriteria();
        if (type != null) {
            criteria.andTypeEqualTo(type.getCode());
        }
        criteria.andParentIdEqualTo(parentId).andIsDeletedEqualTo(0);
        return mapper.selectByExample(example);
    }
}
