package com.example.nanqiao.api.controllers;

import com.example.nanqiao.dao.entity.BuildingInfoDO;
import com.example.nanqiao.dao.repository.BuildingInfoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: coco
 * @Date: 2022/9/10
 **/
@RestController
@RequestMapping("/hi/test")
public class Hello {
    @Resource
    private BuildingInfoDAO buildingInfoDAO;
    @RequestMapping(value = "/world",method = RequestMethod.GET)
    public String hel(){
        return "hello world";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<BuildingInfoDO> query(){
        List<BuildingInfoDO> buildingInfoDOList=buildingInfoDAO.selectOne();
        return buildingInfoDOList;
    }
}
