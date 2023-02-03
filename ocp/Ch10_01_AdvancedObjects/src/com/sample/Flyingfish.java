package com.sample;

public class Flyingfish extends Fish implements Fly {

    public Flyingfish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("飛魚: %s 在水中游泳%n", name);
    }

    @Override
    public void fly() {
        System.out.printf("飛魚: %s 在水面上飄飛，速度%s%n",name, FlySpeed.SPEED);
    }

}
