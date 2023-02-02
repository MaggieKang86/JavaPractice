package com.sample;

public abstract class Fish {

    protected String name;
    public Fish(String name) {
        this.name = name;
    }

//    public void swim() {
//        System.out.printf("魚: %s 在水中游%n", name);
//    }

    // 抽象方法
    public abstract void swim();

}
