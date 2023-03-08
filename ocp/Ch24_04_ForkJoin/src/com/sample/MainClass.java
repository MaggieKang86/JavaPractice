package com.sample;

import javax.swing.*;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;

public class MainClass {

    public static void main(String[] args) {

        int n = 50;  // 計算第 n 個項目
//        System.out.println("使用遞迴...");
//        Instant t1 = Instant.now();  // 程式開始執行的時間
//        System.out.println("t1: " + t1.toString());
//        System.out.printf("第 %d 項: %d%n", n + 1, FibonacciTask.fibonacci(n));
//        Instant t2 = Instant.now();  // 程式執行花了多少時間
//        System.out.println("使用遞迴的時間花了: " + Duration.between(t1, t2).toMillis() + " 毫秒");
//        System.out.println("---------------------");

        System.out.println("使用 Fork/Join...");
        int processors = Runtime.getRuntime().availableProcessors();  // 抓 CPU 有多少核心
        System.out.println("processors: " + processors);
        Instant t3 = Instant.now();                                   // 程式開始執行的時間
        FibonacciTask task = new FibonacciTask(n);                    // 建立物件
        ForkJoinPool pool = new ForkJoinPool(processors);             // 建立執行緒池
        System.out.printf("第 %d 項: %d%n", n + 1, pool.invoke(task)); // 用 invoke 啟動工作
        Instant t4 = Instant.now();                                   // 程式執行花了多少時間
        System.out.println("使用Fork/Join : " + Duration.between(t3, t4).toMillis() + " 毫秒");
        System.out.println("---------------------");

    }

}
