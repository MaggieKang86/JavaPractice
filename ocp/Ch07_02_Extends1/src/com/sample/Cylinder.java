package com.sample;

public class Cylinder extends Circle {

    private  double height;

    public Cylinder() {
        super();  // 呼叫父類別的建構子，完成父類別初始化，目前可省略(因為父類別建構子不用參數)
                  // 若要撰寫，必須寫在建構子的第一行
        System.out.println("Cylinder()...");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 複寫父類別方法：當父類別提供的方法不適合子類別運行，子類別可以改寫父類別的方法
    @Override
    /*
    public double getArea() { return PI * getRadius() * getRadius() * 2 + 2 * PI * getRadius() * height;  }
    */
    public double getArea() {
        return super.getArea() * 2 + getCircumference() * height;
    }
}
