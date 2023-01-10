package com.sample;

public class MainClass {

    public static void main(String[] args) {

        Circle cir = new Circle();
        cir.setRadius(10);
        System.out.printf("cir[r：%.2f, a：%.2f, c：%.2f]：%n" + cir.getRadius(), cir.getArea(), cir.getCircumference());

        Cylinder cyl = new Cylinder();

    }


}
