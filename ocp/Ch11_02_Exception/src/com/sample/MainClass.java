package com.sample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("輸入被除數 a = ");
            int a = scanner.nextInt();
            System.out.println("輸入除數 b = ");
            int b = scanner.nextInt();
            try {
                int c = cal(a, b);
                System.out.printf("%d / %d = %d%n", a, b, c);
            } catch (ArithmeticException ex) {
                System.out.println("[錯誤] 事情大條了！發生錯誤：" + ex);
            }
        } catch (InputMismatchException ex) {
            System.out.println("[錯誤] 輸入資料格式錯誤!" + ex);
        } finally {
            System.out.println("資料庫已關閉!");
        }

        System.out.println("結束!");

    }

    private static int cal(int a, int b) {
        return a / b;
    }

}
