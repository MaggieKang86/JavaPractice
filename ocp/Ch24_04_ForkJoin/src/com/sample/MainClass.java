package com.sample;

import java.time.Duration;
import java.time.Instant;

public class MainClass {

    public static void main(String[] args) {

        int n = 6;  // 計算第6個項目
        System.out.println("使用遞迴...");
        Instant t1 = Instant.now();  // 程式開始執行的時間
        System.out.println("t1: " + t1.toString());
        System.out.printf("第 %d 項: %d%n", n, FibonacciTask.fibonacci(n));
        Instant t2 = Instant.now();  // 程式執行花了多少時間
        System.out.println("使用遞迴的時間花了: " + Duration.between(t1, t2).toMillis() + " 毫秒");
        System.out.println("---------------------");

    }

}
