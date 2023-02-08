package com.sample;

import com.sample.packagea.ClassA;
import com.sample.packagea.ClassB;

public class MainClass {

    public static void main(String[] args) {

        ClassA a = new ClassA();
        a.display();
        System.out.println("-------------");

        ClassB b = new ClassB();
        b.display();
        System.out.println("-------------");


    }

}
