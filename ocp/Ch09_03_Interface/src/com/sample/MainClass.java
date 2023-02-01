package com.sample;

import jdk.swing.interop.SwingInterOpUtils;

public class MainClass {

    public static void main(String[] args) {

        Eagle eagle = new Eagle();
        eagle.flying();
        System.out.println("-------------");
        eagle.display();
    }

}
