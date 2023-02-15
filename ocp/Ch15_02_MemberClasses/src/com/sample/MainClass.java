package com.sample;

public class MainClass {

    public static void main(String[] args) {

        OuterClass outc1 = new OuterClass();
        outc1.outerMethod();
        System.out.println("--------------");
        // OuterClass.InnerClass inc = new OuterClass.InnerClass();

        // 外部類別建立後才建立內部類別
        OuterClass outc2 = new OuterClass();
        OuterClass.InnerClass inc = outc2.new InnerClass();
        inc.display();
        System.out.println("--------------");

        new OuterClass().new InnerClass().display();

    }

}

// --------------------

// 外部類別
class OuterClass {

    private int a = 1;
    private int b = 2;
    private static int c = 3;

    public void outerMethod() {
        InnerClass inc = new InnerClass();
        inc.display();
        System.out.println(inc.b);
    }

    // Member Classes
    public class InnerClass {

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
        }

    }

}
