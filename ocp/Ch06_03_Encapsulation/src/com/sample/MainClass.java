package com.sample;

public class MainClass {

    public static void main(String[] args) {
        Circle cir = new Circle();
        // cir.PI = 1.23;     // 不可修改final資料
        // cir.radius = -10;  // 不可直接存取private成員
        cir.setRadius(-10);
        System.out.printf("r：%.2f, a：%.2f%n", cir.getRadius(), cir.getArea());
        System.out.println("-----------");
        cir.setRadius(5);
        System.out.printf("r：%.2f, a：%.2f%n", cir.getRadius(), cir.getArea());
    }

}
