package com.bjpowernode.trans;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 可選
@EnableTransactionManagement
@MapperScan(basePackages = "com.bjpowernode.trans.mapper")
@SpringBootApplication
public class LessionTransApplication {

    public static void main(String[] args) {
        SpringApplication.run(LessionTransApplication.class, args);
    }

}
