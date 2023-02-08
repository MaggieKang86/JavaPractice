package com.sample.packageb;
import com.sample.packagea.ClassA;

public class ClassC extends ClassA {

    // 以繼承身分覆寫 display() 方法執行
    public void display() {
        System.out.println("ClassC 繼承 ClassA 可以使用的成員: ");
        // System.out.println("-w = " + w);
        // System.out.println(" x = " + x);
        System.out.println("%y = " + y);
        System.out.println("+z = " + z);
        System.out.println("---------");
    }

    // 實作 ClassA 物件操作
    public void doTest() {
        System.out.println("ClassC 實作 ClassA 物件，可以使用的成員: ");

        ClassA a = new ClassA();
        // System.out.println("- a.w = " + a.w);
        // System.out.println("  a.x = " + a.x);
        // System.out.println("% a.y = " + a.y);
        System.out.println("+ a.z = " + a.z);
    }

}
