package com.sample;

// 自訂類別若要放入 TreeSet 的集合內，需在自訂類別實作 Comparable 的介面
public class Book {

    private int id;
    private String name;
    private double price;

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + price + ']';
    }


}
