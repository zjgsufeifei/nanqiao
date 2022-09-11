package com.example.nanqiao.api.controllers;

import com.example.nanqiao.api.NanqiaoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * @Author: coco
 * @Date: 2022/9/11
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {NanqiaoApplication.class})
public class ActivityApplyControllerTest {
    @Autowired
    DataSource dataSource;
    @Test
    public void testDataSource(){
        System.out.println(dataSource.getClass());
    }
}
