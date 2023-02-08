package com.sample.packageb;

import com.sample.packagea.ClassA;

public class ClassD {

    public void display() {
        System.out.println("ClassD...");

        ClassA a = new ClassA();
        // System.out.println("- a.w = " + a.w);
        // System.out.println("  a.x = " + a.x);
        // System.out.println("% a.y = " + a.y);
        System.out.println("+ a.z = " + a.z);
    }

}
