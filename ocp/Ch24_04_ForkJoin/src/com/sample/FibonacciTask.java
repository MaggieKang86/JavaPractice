package com.sample;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Long> {

    private int n;

    public FibonacciTask(int n) {
        this.n = n;
    }

    // static 遞迴
    public  static long fibonacci(int n) {  // 費式數列
        if(n < 2) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    @Override
    protected Long compute() {

        if(n < 40) {                                           // 切割工作的門檻值
            return fibonacci(n);                               // 若工作量不到40時，不再切割工作並開始處理資料並回傳結果
        } else {                                               // 若工作量還是很多
//            FibonacciTask t1 = new FibonacciTask(n - 1);    // 建立 t1 的 ForkJoin 處理一半的工作
//            t1.fork();                                         // 呼叫 t1.fork() 做非同步處理
//            FibonacciTask t2 = new FibonacciTask(n - 2);    // 建立 t2 的 ForkJoin 處理一半的工作
//            return t1.join() + t2.compute();                   // 若 t1 t2 皆有結果，則合併
            ForkJoinTask<Long> t1 = new FibonacciTask(n - 1).fork();
            ForkJoinTask<Long> t2 = new FibonacciTask(n - 2).fork();
            return t1.join() + t2.join();
        }

    }

}
