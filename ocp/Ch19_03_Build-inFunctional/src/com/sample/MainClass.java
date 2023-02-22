package com.sample;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        String str = null;
        str = "this is java, that is python";

        // Consumer 消費型：有參數、無回傳值
        // Consumer<T> 的 accept(T t) 方法接收一個參數，執行後無回傳值
        Optional.ofNullable(str).ifPresent(s -> System.out.println(s.toUpperCase()));
        Optional.ofNullable(str).ifPresent(System.out::println);
        System.out.println("------------");

        // Function 功能型：有參數、有回傳值
        // Function<T,R> 的 apply(T t) 方法接收一個參數，執行後回傳指定型態的結果
        Optional<String> opt1 = Optional.ofNullable(str).map(s -> {
            System.out.println("map: " + s);
            return s.toUpperCase();
        } );
        System.out.println("opt1 orElse(): " + opt1.orElse("is Empty"));
        System.out.println("------------");

        Optional<String> opt2 = Optional.ofNullable(str).map(String :: toUpperCase);
        System.out.println("opt2 orElse(): " + opt2.orElse("is Empty"));
        System.out.println("------------");

        // Predicate 診斷型：有參數、有回傳 boolean
        // Predicate<T> 的 test(T t) 方法接收一個參數回傳 boolean
        Optional<String> opt3 = Optional.ofNullable(str).filter(s -> s.startsWith("this"));
        System.out.println("opt3: " + opt3);
        System.out.println("opt3 orElse(): " + opt3.orElse("is Empty"));
        opt3.ifPresent(System.out::println);
        System.out.println("------------");

        // Supplier 供應型：沒有參數、有回傳值
        // Supplier<T> 的 get() 方法用來回傳特定的結果，回傳值的型態必須同呼叫的方法的回傳型態
        String temp1 = Optional.ofNullable(str).orElse("Java SE 8");
        System.out.println("temp1: " + temp1);

        String temp2 = Optional.ofNullable(str).orElseGet(() -> "Java SE 8");
        System.out.println("temp2: " + temp2);
        System.out.println("------------");

        // BiConsumer：有2個參數、無回傳值
        // BiConsumer<T,U> 的 accept(T t, U u) 傳入2個參數，無回傳值
        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("A01", "Java SE 8");
        bookMap.put("B02", "Python 3.9");
        bookMap.put("C03", "Android 10");

        // 方法一
        Set<String> keys = bookMap.keySet();
        for(String key : keys) {
            System.out.printf("%s\t%s%n", key, bookMap.get(key));
        }
        System.out.println("------------");

        // 方法二
        bookMap.forEach((k, v) -> System.out.printf("%s\t%s%n",k, v));

    }

}
