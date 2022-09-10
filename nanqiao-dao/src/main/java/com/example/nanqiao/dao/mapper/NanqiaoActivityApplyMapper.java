package com.example.nanqiao.dao.mapper;

import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDO;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NanqiaoActivityApplyMapper {
    long countByExample(NanqiaoActivityApplyDOExample example);

    int insert(NanqiaoActivityApplyDO record);

    int insertSelective(NanqiaoActivityApplyDO record);

    List<NanqiaoActivityApplyDO> selectByExampleWithRowbounds(NanqiaoActivityApplyDOExample example, RowBounds rowBounds);

    List<NanqiaoActivityApplyDO> selectByExample(NanqiaoActivityApplyDOExample example);

    int updateByExampleSelective(@Param("record") NanqiaoActivityApplyDO record, @Param("example") NanqiaoActivityApplyDOExample example);

    int updateByExample(@Param("record") NanqiaoActivityApplyDO record, @Param("example") NanqiaoActivityApplyDOExample example);
}