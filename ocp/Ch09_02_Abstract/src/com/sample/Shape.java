package com.sample;

public abstract class Shape {

    // 欄位
    private String type;
    private String color;

    // 建構子
    public Shape(String type, String color) {

        this.type = type;
        this.color = color;

    }

    // 具體方法
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public double getArea() {
//        System.out.println("請覆寫此方法，重新定義面積計算公式...");
//        return 0.0;
//    }

    //  抽象方法
    public abstract double getArea();

}
