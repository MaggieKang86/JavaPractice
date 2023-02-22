package com.sample;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Android"));
        System.out.println("list: " + list);
        System.out.println("------------");

        // 用 for 迴圈讀資料
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------");

        // 用 forEach + Lambda 讀資料
        list.forEach(s -> System.out.println(s));
        System.out.println("------------");

        // Method References
        list.forEach(System.out :: println);  // Lambda 的 body 只呼叫另一個方法時，可使用 Method References
        System.out.println("------------");

        // 呼叫自訂類別 static 方法
        list.forEach(s -> Test.staticTest(s));
        System.out.println("------------");

        // Method References
        list.forEach(Test :: staticTest);
        System.out.println("------------");

        // 呼叫自訂類別物件成員方法
        Test myTest = new Test();
        list.forEach(s -> myTest.instanceTest(s));
        System.out.println("------------");

        // Method References
        list.forEach(myTest :: instanceTest);
        System.out.println("------------");

    }

}
