package com.sample;

public class Human implements Swimmer {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.printf("餵食員: %s 在水中餵食小丑魚%n", name);
    }

}
