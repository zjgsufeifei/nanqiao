package com.example.nanqiao.core;

import com.example.nanqiao.DaoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: haiyi
 * @Date: 2022/9/10
 **/
@ComponentScan
@Configuration
@Import({DaoConfiguration.class})
public class CoreConfiguration {
}
