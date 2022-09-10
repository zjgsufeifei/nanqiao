package com.example.nanqiao.dao.repository;

import com.example.nanqiao.dao.entity.BuildingInfoDO;

import java.util.List;

/**
 * @Author: haiyi
 * @Date: 2022/9/10
 **/
public interface BuildingInfoDAO {
    List<BuildingInfoDO> selectOne();
}
