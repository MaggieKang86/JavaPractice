package com.sample;

public class Circle extends Shape {

    private double radius;
    public final double PI = 3.14;


    public Circle(double radius, String type, String color) {
        super(type, color);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

}
