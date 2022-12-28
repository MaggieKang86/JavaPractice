package com.sample;

public class MainClass {

    public static void main(String[] args) {
        //物件建立語法：類別型別 參考名稱 = new 建構子();
        Account user1 = new Account();
        //型別              com.sample.Account.java裡建構子的Account

        //物件操作
        //語法：參考名稱.物件成員
        user1.name = "Lisa";
        user1.balance = 500;
        System.out.println("user1");
        user1.display();
        System.out.println("---------------------");
    }

}
