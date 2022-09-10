package com.example.nanqiao.dao.mapper;

import com.example.nanqiao.dao.entity.BuildingInfoDO;
import com.example.nanqiao.dao.entity.BuildingInfoDOExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface BuildingInfoMapper {
    long countByExample(BuildingInfoDOExample example);

    int insert(BuildingInfoDO record);

    int insertSelective(BuildingInfoDO record);

    List<BuildingInfoDO> selectByExampleWithRowbounds(BuildingInfoDOExample example, RowBounds rowBounds);

    List<BuildingInfoDO> selectByExample(BuildingInfoDOExample example);

    int updateByExampleSelective(@Param("record") BuildingInfoDO record, @Param("example") BuildingInfoDOExample example);

    int updateByExample(@Param("record") BuildingInfoDO record, @Param("example") BuildingInfoDOExample example);
}