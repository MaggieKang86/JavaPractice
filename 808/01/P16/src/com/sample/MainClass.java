package com.sample;

public class MainClass {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();  // 將字串放到 String pool 外
        // String str1 = sb1.toString().intern();  // 將字串放到 String pool 內
        // String str2 = "Duke"; // 將字串放到 String pool 內
        String str2 = str1; // 將 str2 指向 str1 資料
        // System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

    }

}
