package com.sample;

public class MainClass {

    public static void main(String[] args) {

//        Shape shape = new Shape("形狀", "綠色");
//        System.out.printf("shape:%s, %s, a:%.2f%n%n", shape.getType(), shape.getColor(), shape.getArea());

        Circle cir = new Circle(10, "圓形", "紅色");
        System.out.printf("cir:%s, %s, r:%.2f, a:%.2f%n%n", cir.getType(), cir.getColor(), cir.getRadius(), cir.getArea());

        Rectangle rect = new Rectangle(5,4,"矩形", "藍色");
        System.out.printf("rect:%s, %s, 長:%d, 寬:%d, 面積:%.2f%n%n", rect.getType(), rect.getColor(), rect.getLength(), rect.getWidth(), rect.getArea());

    }
}
