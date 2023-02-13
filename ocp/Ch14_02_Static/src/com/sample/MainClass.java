package com.sample;

public class MainClass {

    public static int count = 0;
    int a = 100; // 測試用

    private static final boolean[] switchs = new boolean[5];

    // static 區塊 在載入時就初始化
    static {

        System.out.printf("static() count = %d%n", ++count);

        for(int i = 0; i < switchs.length; i++){
            switchs[i] = true;

        }

    }

    public static void main(String[] args) {

        System.out.printf("main() count = %d%n", ++count);

        Book book1 = new Book();
        Book book2 = new Book("Java SE");

        System.out.println("------------");
        for(boolean boo : switchs) {
            System.out.printf("%b | ", boo);

        }

        System.out.println("\n------------");

        int a = 5;
        System.out.println("1. a = " + a);


        // 區域區塊
        {
            System.out.println("2. a = " + a);
            // int a = 50;  // 重複宣告
            int b = 6;
            System.out.println("1. b = " + b);
        }

        int b = 60;
        System.out.println("2. b = " + b);

    }

}
