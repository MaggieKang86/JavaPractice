package com.sample;

public class MainClass {

    public static void main(String[] args) {
        average(10, 20);
        average(10, 20, 30);
        average(10, 20, 30, 40, 50);
    }

    private static void average(int... scores) {  // 可變動參數
        int total = 0;
        for(int s : scores) {
            total += s;
        }
        System.out.println("total：" + total);
        System.out.println("average：" + total / scores.length);
        System.out.println("-----------");
    }

    // 可變動參數只能寫一組，且只能放在最後一個參數
    // private void test1(int... i, double... d) {}
    // private void test2(String... s, String s1) {}
    private void test3(int i, String s, double... d) {}
    private void test4(String s, int i, int... i1) {}


}
