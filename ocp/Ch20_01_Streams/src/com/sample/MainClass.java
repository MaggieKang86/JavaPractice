package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

        // Stream 建立方式 Arrays.asList()
        Stream<Integer> st1 = Arrays.asList(1, 2, 3, 4, 5).stream();
        System.out.println("st1: " + st1);

        // forEach() 終端操作取出 Stream 資料
        st1.forEach(i -> System.out.println(i*10 + " "));      // 1.執行後，st1 內容已取出
        System.out.println("------------");
        // st1.forEach(i -> System.out.println(i*100 + " "));  // 2.錯誤，因為 st1 內容是空的

        st1 = Arrays.asList(2, 4, 6, 8).stream();
        st1.forEach(i -> System.out.println(i*100 + " "));
        System.out.println("------------");

    }

}
