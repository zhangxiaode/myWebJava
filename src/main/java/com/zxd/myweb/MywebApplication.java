package com.zxd.myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("com.zxd.myweb.mapper")
public class MywebApplication {
//public class MywebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MywebApplication.class, args);
    }

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(MywebApplication.class);
//	}
}

