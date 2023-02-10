package com.sample;

public class MainClass {

    public static int count = 0;

    // static 區塊 在載入時就初始化
    static {
        System.out.printf("static() count = %d%n", ++count);
    }

    public static void main(String[] args) {

        System.out.printf("main() count = %d%n", ++count);

    }

}
