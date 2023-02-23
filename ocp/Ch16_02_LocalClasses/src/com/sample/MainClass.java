package com.sample;

public class MainClass {

    public static void main(String[] args) {
        OuterClass outc1 = new OuterClass();
        outc1.outerMethod(4);
    }

}

// --------------------

// 外部類別
class OuterClass {

    private int a = 1;
    private int b = 2;
    private static int c = 3;

    public void outerMethod(int d) {

        int e = 5;
        int f = 6;
        f = 60;

        // Local Classes
        class InnerClass {

            // 欄位
            private int b = 4;
            // private static int c = 5; // Member classes 不可以有static 成員

            // 建構子
            public InnerClass() {
                System.out.println("InnerClass()...");
            }

            // 方法
            public void display() {
                System.out.println("OuterClass a = " + a);
                System.out.println("OuterClass b = " + OuterClass.this.b);
                System.out.println("OuterClass c = " + OuterClass.c);
                System.out.println("InnerClass b = " + b);
                System.out.println("outerMethod d = " + d);
                System.out.println("outerMethod e = " + e);
                // System.out.println("outerMethod f = " + f);
            }

        }

        InnerClass inc = new InnerClass();
        inc.display();

    }

}
