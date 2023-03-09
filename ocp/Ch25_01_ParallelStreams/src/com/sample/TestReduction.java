package com.sample;

import java.util.stream.IntStream;

public class TestReduction {

    public static void main(String[] args) {

        int r1 = IntStream.rangeClosed(1, 5)
                .parallel()
                .reduce(0, (a, b) -> a + b);   // 計算 a+b
        System.out.println("Result1: " + r1);

        int r2 = IntStream.rangeClosed(1, 5)
                          .parallel()
                          .reduce(0, (sum, element) -> sum + element);   // 計算 a+b
        System.out.println("Result2: " + r2);

        int r3 = IntStream.rangeClosed(1, 5)
                          .parallel()
                          .reduce(0, Integer::sum);
        System.out.println("Result3: " + r3);
    }

}
