package com.sample;

public class MainClass {

    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.setRadius(10);
        System.out.printf("cir[r:%.2f, a:%.2f, c:%.2f]%n", cir.getRadius(), cir.getArea(), cir.getCircumference());
        System.out.println("-------------");

        Cylinder cyl = new Cylinder();
        cyl.setRadius(10);
        cyl.setHeight(10);
        System.out.printf("cyl[r:%.2f, h:%.2f, a:%.2f]%n", cyl.getRadius(), cyl.getHeight(), cyl.getArea());
    }

}
