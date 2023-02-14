package com.sample;

public class MainClass {

    public static void main(String[] args) {

//        SingletonClass sc1 = new SingletonClass();
//        SingletonClass sc2 = new SingletonClass();
//        SingletonClass sc3 = new SingletonClass();

        SingletonClass sc1 = SingletonClass.getInstance();
        SingletonClass sc2 = SingletonClass.getInstance();
        SingletonClass sc3 = SingletonClass.getInstance();

        System.out.println("sc1: " + sc1);
        System.out.println("sc2: " + sc2);
        System.out.println("sc3: " + sc3);

    }

}

// ------------------

class SingletonClass {

    // 建立 SingletonClass 實例
    private static final SingletonClass instance = new SingletonClass();

    // 建構子必須是 private
    private SingletonClass() {
        System.out.println("SingletonClass()...");
    }

    // 靜態工廠模式
    public static SingletonClass getInstance() {
        return instance;
    }

}