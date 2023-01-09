package com.sample;

public class MainClass {

    public static void main(String[] args) {
        int total_1 = Calculator.sum(50);
        System.out.println("total_1 = " + total_1);
        System.out.println("---------");

        double total_2 = Calculator.sum(1.0, 2.0);
        System.out.println("total_2 = " + total_2);
        System.out.println("---------");

        double total_3 = Calculator.sum(1.23, 20);
        System.out.println("total_3 = " + total_3);
        System.out.println("---------");
    }

}
