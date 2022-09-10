package com.example.nanqiao.api;


import com.example.nanqiao.core.CoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAspectJAutoProxy
@Import({CoreConfiguration.class})
public class NanqiaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NanqiaoApplication.class, args);
	}

}
