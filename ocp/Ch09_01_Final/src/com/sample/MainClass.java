package com.sample;

public class MainClass {

    public static void main(String[] args) {

    SubClass sub = new SubClass();
    sub.display();

    }

}

//-------------------------------

class SuperClass{

    public void display() {

    }
}

class SubClass extends SuperClass {

    // 欄位
    int a;      // 使用預設值初始化
    int b = 2;  // 使用明確指定初始化
    int c;      // 使用建構子初始化

    final int D = 4;  // 常數，使用明確指定初始化
    final int E;      // 常數，使用建構子初始化

    // 建構子
    public SubClass() {
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        c = 3;
        System.out.println("c : " + c);
        System.out.println("D : " + D);
        E = 5;
        System.out.println("E : " + E);
        System.out.println("------------------");
    }

    @Override
    public void display() {
        System.out.println("a : " + a);
        a = 10;
        System.out.println("a : " + a);
        b = 20;
        System.out.println("b : " + b);
        c = 30;
        System.out.println("c : " + c);
        // D = 40;  // final 的常數給值後就不可修改
        // E = 50;  // final 的常數給值後就不可修改

        // 方法內的常數
        final int F = 60;
        System.out.println("display() F : " + F);
        // F = 600;  // final 的常數給值後就不可修改

    }

}