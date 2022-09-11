package com.example.nanqiao.dao.mapper;

import com.example.nanqiao.dao.entity.ActivityApplyStatisticsDO;
import com.example.nanqiao.dao.entity.ActivityApplyStatisticsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ActivityApplyStatisticsMapper {
    long countByExample(ActivityApplyStatisticsDOExample example);

    int insert(ActivityApplyStatisticsDO record);

    int insertSelective(ActivityApplyStatisticsDO record);

    List<ActivityApplyStatisticsDO> selectByExampleWithBLOBsWithRowbounds(ActivityApplyStatisticsDOExample example, RowBounds rowBounds);

    List<ActivityApplyStatisticsDO> selectByExampleWithBLOBs(ActivityApplyStatisticsDOExample example);

    List<ActivityApplyStatisticsDO> selectByExampleWithRowbounds(ActivityApplyStatisticsDOExample example, RowBounds rowBounds);

    List<ActivityApplyStatisticsDO> selectByExample(ActivityApplyStatisticsDOExample example);

    int updateByExampleSelective(@Param("record") ActivityApplyStatisticsDO record, @Param("example") ActivityApplyStatisticsDOExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityApplyStatisticsDO record, @Param("example") ActivityApplyStatisticsDOExample example);

    int updateByExample(@Param("record") ActivityApplyStatisticsDO record, @Param("example") ActivityApplyStatisticsDOExample example);
}