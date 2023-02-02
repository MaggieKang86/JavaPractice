package com.sample;

public class Human extends Fish {

    public Human(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("餵食員: %s 在水中餵食小丑魚%n", name);
    }

}
