package com.sample;

public class Book {
    // 宣告欄位(沒有寫static所以是物件成員)
    public String name;
    public int price;

    // 欄位：類別成員
    public static int a;  // a 沒給值，預設值為0

    // 宣告方法(沒有寫static所以是物件成員)
    // 語法：[存取修飾字] 修飾字 回傳型別 方法名稱 (參數列) {...}
    public void display() {
        System.out.println("Name：" + name);
        System.out.println("Price：" + price);
        System.out.println("----------");
    }

    // 設值方法
    public void setFields(String name, int price) {
        //使用 this (this=這個物件)
        this.name = name; // 物件成員的name = 參數的name
        this.price = price;

    }

    // 測試
    public void test1() {  // 物件成員方法可呼叫1.物件成員 2.物件成員方法 3.類別成員 4.類別成員方法
        System.out.println(name); // 物件成員
        System.out.println(a); // 類別成員
        display(); // 物件成員
        test2(); // 類別成員
    }

    public static void doTest() { // 類別成員方法只可呼叫類別成員
        // 錯誤 System.out.println(name);  // 物件成員
        System.out.println(a); // 類別成員
        // 錯誤 display();  // 物件成員
        test2();  // 類別成員
    }

    public static void test2() {
        System.out.println("static test2()...");
    }


}
