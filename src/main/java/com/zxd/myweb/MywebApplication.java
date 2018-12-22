package com.zxd.myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.zxd.myweb.mapper")
public class MywebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebApplication.class, args);
    }

}

