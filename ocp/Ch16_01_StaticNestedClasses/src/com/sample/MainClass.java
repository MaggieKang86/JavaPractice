package com.sample;

public class MainClass {

    public static void main(String[] args) {
        OuterClass.InnerClass inc = new OuterClass.InnerClass();
        inc.display();
    }

}

// 外部類別
class OuterClass {

    private int a = 1;
    private int b = 2;
    private static int c = 3;

    // Static nested classes
    public static class InnerClass {

        // 欄位
        private int b = 4;
        private static int c = 5;

        // 建構子
        public InnerClass() {
            System.out.println("InnerClass()...");
        }

        // 方法
        public void display() {
            // System.out.println("OuterClass a = " + a);
            // System.out.println("OuterClass b = " + OuterClass.this.b);
            System.out.println("OuterClass c = " + OuterClass.c);
            System.out.println("InnerClass b = " + b);
            System.out.println("InnerClass c = " + c);
        }

    }

}
