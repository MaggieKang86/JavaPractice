package com.sample;

public class Circle {

    //欄位
    public final double PI = 3.14;  // final常數：不可變
    private double radius;

    // 公開的方法：設值
    public void setRadius(double radius) {
        if(check(radius)) {
            this.radius = radius;
        } else {
            this.radius = 0;
            System.out.println("半徑不可小於 0!");
        }
    }

    // 私有方法：檢查數值是否為正數
    private boolean check(double number) {
        if(number >= 0) return true;
        else return false;
    }

    // 公開的方法：取值
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }



}
