package com.sample;

public interface Fly {

    // 常數欄位
    // public int a;       // 常數值必須明確指定
    // private int b = 2;  // 介面中沒有private資料，因為這樣子類別無法使用
    int SPEED = 10;  // public static final int SPEED = 10; (不可再做修改的類別成員)

    // 介面沒有建構子
//    public FLY() {
//    }

    // 介面沒有具體方法
//    public void flying() {
//    }

    // 抽象方法
    void flying();  // public abstract void flying();

    // Java 8.0 新增 default 方法
    public default void display() {
        System.out.println("display() SPEED:" + SPEED);
    }

    // Java 8.0 新增 static 方法
    public static void moveSpeed() {
        System.out.println("moveSpeed() SPEED:" + SPEED);
    }


}
