package com.example.nanqiao.core.service.impl;

import com.example.nanqiao.common.request.content.ContentAddRequest;
import com.example.nanqiao.common.request.content.ContentQueryRequest;
import com.example.nanqiao.common.request.content.ContentUpdateRequest;
import com.example.nanqiao.common.response.PageResult;
import com.example.nanqiao.common.util.MyBeanUtils;
import com.example.nanqiao.common.vo.ContentVO;
import com.example.nanqiao.core.service.ContentService;
import com.example.nanqiao.dao.entity.Content;
import com.example.nanqiao.dao.repository.ContentDAO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author smile
 */
@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentDAO dao;


    @Override
    public boolean add(ContentAddRequest request) {
        return dao.add(MyBeanUtils.convert(request, Content.class));
    }

    @Override
    public boolean update(ContentUpdateRequest request) {
        return dao.update(MyBeanUtils.convert(request, Content.class));
    }

    @Override
    public PageResult<ContentVO> list(ContentQueryRequest request) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<Content> records = dao.list(request.getCatalogId());

        long total = ((Page<Content>) records).getTotal();
        List<ContentVO> list = MyBeanUtils.convertList(records, ContentVO.class);
        return PageResult.<ContentVO>builder().list(list).total(total).build();
    }
}
