package com.sample;

public class Superman implements Swimmer, Fly {

    private String name;

    public Superman(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.printf("超人: %s 在水中拯救餵食員%n", name);
    }

    @Override
    public void fly() {
        System.out.printf("超人: %s 在空中飛行%n", name);
    }


}
