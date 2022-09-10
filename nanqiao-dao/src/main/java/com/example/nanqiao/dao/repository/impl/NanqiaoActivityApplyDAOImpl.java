package com.example.nanqiao.dao.repository.impl;

import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDO;
import com.example.nanqiao.dao.entity.NanqiaoActivityApplyDOExample;
import com.example.nanqiao.dao.mapper.NanqiaoActivityApplyMapper;
import com.example.nanqiao.dao.repository.NanqiaoActivityApplyDAO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@Repository
public class NanqiaoActivityApplyDAOImpl implements NanqiaoActivityApplyDAO {
    @Resource
    private NanqiaoActivityApplyMapper nanqiaoActivityApplyMapper;
    @Override
    public List<NanqiaoActivityApplyDO> queryActivityApplyInfo(String openId, Long activityId) {
        NanqiaoActivityApplyDOExample applyDOExample=new NanqiaoActivityApplyDOExample();
        applyDOExample.createCriteria().andOpenIdEqualTo(openId).andActivityIdEqualTo(activityId);
        return nanqiaoActivityApplyMapper.selectByExample(applyDOExample);
    }
}
