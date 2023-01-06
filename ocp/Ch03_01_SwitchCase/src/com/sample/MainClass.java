package com.sample;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入 Apple | Kiwi | Orange：");

        String keyIn = scanner.next();
        final String KIWI = "Kiwi";  //常數

        switch (keyIn) {
            case "Apple":
                System.out.println("蘋果");
                break;
            case KIWI:
                System.out.println("奇異果");
                break;
            case "Orange":
                System.out.println("柳丁");
                break;
            default:
                System.out.println("查無此項商品!");
        }
    }

}
