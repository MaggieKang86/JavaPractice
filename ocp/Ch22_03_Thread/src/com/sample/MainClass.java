package com.sample;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("主方法: " + Thread.currentThread().toString());

        Car tCar = new Car("T牌");
        Car fCar = new Car("F牌");

        // tCar.run();
        // fCar.run();

        tCar.start();
        fCar.start();

        System.out.println("車輛生產完成！");

    }

}

// ------------------------

class Car extends Thread {
    String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 3; i++) {
            System.out.printf("生產執行緒: %s, %s 第 %d 輛車子生產完成%n", Thread.currentThread().toString(), name, i);
        }
    }

}