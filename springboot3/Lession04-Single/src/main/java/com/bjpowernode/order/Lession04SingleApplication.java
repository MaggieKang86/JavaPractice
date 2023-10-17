package com.bjpowernode.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 啟動類，有@SpringBootApplication註解的類是啟動類（入口類）
// 啟動類在根包的下面（推薦）
@SpringBootApplication
public class Lession04SingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lession04SingleApplication.class, args);
    }

}
