package com.sample;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//        System.out.println("使用 Fork/Join...");
//        int processors = Runtime.getRuntime().availableProcessors();  // 抓 CPU 有多少核心
//        System.out.println("processors: " + processors);
//        Instant t3 = Instant.now();                                   // 程式開始執行的時間
//        FibonacciTask task = new FibonacciTask(n);                    // 建立物件
//        ForkJoinPool pool = new ForkJoinPool(processors);             // 建立執行緒池
//        System.out.printf("第 %d 項: %d%n", n + 1, pool.invoke(task)); // 用 invoke 啟動工作
//        Instant t4 = Instant.now();                                   // 程式執行花了多少時間
//        System.out.println("使用Fork/Join : " + Duration.between(t3, t4).toMillis() + " 毫秒");
//        System.out.println("---------------------");

        System.out.println("使用Java 8 的 Stream...\n[0] [1]");
        Instant t5 = Instant.now();
        List<Long> list =Stream.iterate(new long[] {0, 1}, i -> new long[] {i[1], i[0] + i[1]})  //用陣列 i 的值創造一個新的陣列
                          .limit(n + 1)   //算到第 n + 1 項
                          .peek(i -> System.out.println(i[0] + "\t" + i[1]))  // 窺視陣列 i 中 index 0 跟 1 的位置是什麼數字
                          .map(i -> i[0])  // 抓出陣列 i 中所有 index 0 的資料
                          .sequential()    // 循序處理
                       // .parallel()      // 平行處理 (多個線程做運算)
                          .collect(Collectors.toList());  // 蒐集結果
        Instant t6 = Instant.now();
        System.out.printf("第 %d 項: %d%n", n + 1, list.get(list.size() - 1));
        System.out.println("使用Java 8 的 Stream : " + Duration.between(t5, t6).toMillis() + " 毫秒");

    }

}
