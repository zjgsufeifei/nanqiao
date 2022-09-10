package com.example.nanqiao.dao.repository.impl;

import com.example.nanqiao.dao.entity.BuildingInfoDO;
import com.example.nanqiao.dao.entity.BuildingInfoDOExample;
import com.example.nanqiao.dao.mapper.BuildingInfoMapper;
import com.example.nanqiao.dao.repository.BuildingInfoDAO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: haiyi
 * @Date: 2022/9/10
 **/
@Repository
public class BuildingInfoDAOImpl implements BuildingInfoDAO {
    @Resource
    private BuildingInfoMapper buildingInfoMapper;
    @Override
    public List<BuildingInfoDO> selectOne() {
        BuildingInfoDOExample buildingInfoDOExample=new BuildingInfoDOExample();
        buildingInfoDOExample.createCriteria().andBuildingDetailIsNotNull();
        return buildingInfoMapper.selectByExample(buildingInfoDOExample);
    }
}
