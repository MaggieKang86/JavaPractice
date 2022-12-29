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
        System.out.println("user1:");
        user1.display();
        System.out.println("---------------------");

        Account user2 = new Account();
        user2.name = "Maggie";
        user2.balance = 2000000;
        System.out.println("user2:");
        user2.display();
        System.out.println("---------------------");

        Account user3 = user2;
        System.out.println("user3:");
        user3.balance = 5000;
        user3.display();
        System.out.println("user2:");
        user2.display();
        System.out.println("---------------------");

        user1 = user3;
        System.out.println("user1:");
        user1.display();
        System.out.println("---------------------");

        //-----------------------------------------
        //null 空：物件型別的預設值
        user2 = null; //代表user2不指向任何物件
        //user2.balance = 2000; //NullPointerException
    }

}
