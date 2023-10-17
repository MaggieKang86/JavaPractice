package com.bjpowernode.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan(basePackages = "com.bjpowernode.web")  // 掃描該 package 中的 @WebServlet 註解
@SpringBootApplication
public class Lession13ServletFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lession13ServletFilterApplication.class, args);
    }

}
