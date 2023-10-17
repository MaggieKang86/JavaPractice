package com.bjpowernode.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 掃描 Mapper 接口的位置
@MapperScan(basePackages = "com.bjpowernode.mybatis.mapper")
@SpringBootApplication
public class Lession10MyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lession10MyBatisApplication.class, args);
    }

}
