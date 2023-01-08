package com.sample;

import java.util.Date;

public class Book {

    // 欄位
    private int id;
    private String name;
    private double price;
    private Date date = new Date();

    // 建構子constructor：初始化物件，只被呼叫一次
    // 語法：[存取修飾] 類別名稱(參數列) {...}
    // 建立無參數建構子
    public Book() {
        System.out.println("book()...");
        setId(2);
        setName("Python 3.9");
        setPrice(600);
    }

    // 建立有參數建構子
    public Book(int id, String name, double price) {
        System.out.println("Book(id, name, price)...");
        setId(id);
        setName(name);
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }
}
