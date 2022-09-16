package com.example.nanqiao.dao.mapper;

import com.example.nanqiao.dao.entity.ActivityInfoDO;
import com.example.nanqiao.dao.entity.ActivityInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ActivityInfoMapper {
    long countByExample(ActivityInfoDOExample example);

    int insert(ActivityInfoDO record);

    int insertSelective(ActivityInfoDO record);

    List<ActivityInfoDO> selectByExampleWithBLOBsWithRowbounds(ActivityInfoDOExample example, RowBounds rowBounds);

    List<ActivityInfoDO> selectByExampleWithBLOBs(ActivityInfoDOExample example);

    List<ActivityInfoDO> selectByExampleWithRowbounds(ActivityInfoDOExample example, RowBounds rowBounds);

    List<ActivityInfoDO> selectByExample(ActivityInfoDOExample example);

    int updateByExampleSelective(@Param("record") ActivityInfoDO record, @Param("example") ActivityInfoDOExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityInfoDO record, @Param("example") ActivityInfoDOExample example);

    int updateByExample(@Param("record") ActivityInfoDO record, @Param("example") ActivityInfoDOExample example);
}