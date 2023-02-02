package com.sample;

public class Anemonefish extends Fish {

    public Anemonefish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("小丑魚: %s 在水中戲水%n", name);
    }

}
