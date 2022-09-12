package com.example.nanqiao.dao.repository;

import com.example.nanqiao.dao.entity.Content;

import java.util.List;

/**
 * @author smile
 */
public interface ContentDAO {

    boolean add(Content record);

    boolean update(Content record);

    List<Content> list(long catalogId);
}
