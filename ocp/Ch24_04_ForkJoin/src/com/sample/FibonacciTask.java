package com.sample;

public class FibonacciTask {

    // static 遞迴
    public  static long fibonacci(int n) {  // 費式數列
        if(n < 2) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

}
