package com.sample;

public class MainClass {

    public static void main(String[] args) {

        Test test = new Test();
        test.setItem("Java");
        System.out.println("-----");
        System.out.println(test.getItem());

    }
}
