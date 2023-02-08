package com.sample;

import com.sample.packagea.ClassA;
import com.sample.packagea.ClassB;
import com.sample.packageb.ClassC;
import com.sample.packageb.ClassD;

public class MainClass {

    public static void main(String[] args) {

        ClassA a = new ClassA();
        a.display();
        System.out.println("-------------");

        ClassB b = new ClassB();
        b.display();
        System.out.println("-------------");

        ClassC c = new ClassC();
        c.display();
        c.doTest();
        System.out.println("-------------");

        ClassD d = new ClassD();
        d.display();

    }

}
