package com.sample;

public class MainClass {

    public static void main(String[] args) {

        // 呼叫 類別成員 【欄位】
        // 呼叫類別成員語法：類別名稱.類別成員
        System.out.println("int 最大值：" + Integer.MAX_VALUE);
        // 呼叫 類別成員 【方法】
        System.out.println("亂數：" + Math.random());

        // 呼叫物件成員語法：物件參考名稱.物件成員
        // Step1：先建立物件
        Book book = new Book();
        // Step2：呼叫 物件成員 【欄位】
        book.name = "Java SE 8";
        book.price = 800;
        // Step3：呼叫 物件成員 【方法】
        book.display();

        // ----------------------
        // 呼叫設值的方法，將資料交給方法指定給欄位
        book.setFields("Python 3.8", 700);
        book.display();

        System.out.println("呼叫物件成員 test()...");
        book.test1();  // 物件

        System.out.println("呼叫類別成員 doTest()...");
        Book.doTest(); // 類別


    }
}
