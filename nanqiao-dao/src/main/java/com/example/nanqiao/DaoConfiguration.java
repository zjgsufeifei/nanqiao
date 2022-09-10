package com.example.nanqiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * @Author: haiyi
 * @Date: 2022/9/10
 **/
@ComponentScan
@Configuration
@MapperScan({"com.example.nanqiao.dao.mapper"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DaoConfiguration {
}
