package com.sample;

public class Calculator {

    public static int sum(int x, int y) {
        System.out.println("sum(int x, int y)...");
        return x + y;
    }

    public static double sum(double x, double y) {
        System.out.println("double(double x, double y)...");
        return x + y;
    }

    public static int sum(int x) {
        System.out.println("int sum(int x)...");
        return x + 10;
    }

}
