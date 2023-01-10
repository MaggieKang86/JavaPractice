package com.sample;

public class Circle {
    
    private double radius;
    public final double PI = 3.14;
    
    public Circle() {
           System.out.println("Circle()...");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}
