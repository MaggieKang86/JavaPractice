package com.sample;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("輸入被除數 a = ");
        int a = scanner.nextInt();
        System.out.println("輸入除數 b = ");
        int b = scanner.nextInt();
        try {
            int c = cal(a, b);
            System.out.printf("%d / %d = %d%n",a ,b ,c);
        } catch(ArithmeticException ex) {
            System.out.println("[錯誤] 事情大條了！發生錯誤：" + ex);
        }
        System.out.println("結束!");
    }

    private static int cal(int a, int b) {
        return a / b;
    }

}
