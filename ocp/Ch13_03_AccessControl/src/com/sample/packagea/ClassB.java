package com.sample.packagea;

public class ClassB {

    public void display() {
        System.out.println("ClassB...");

        ClassA a = new ClassA();
        // System.out.println("- a.w = " + a.w);
        System.out.println("  a.x = " + a.x);
        System.out.println("% a.y = " + a.y);
        System.out.println("+ a.z = " + a.z);
    }

}
