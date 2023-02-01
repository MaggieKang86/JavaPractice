package com.sample;

public class Eagle implements Fly{

    @Override
    public void flying() {
        System.out.println("老鷹在飛行....");
        System.out.println("SPEED: " + SPEED);

        // 呼叫 default 方法
        display();

        // 呼叫 static 方法 (類別成員)
        Fly.moveSpeed();

    }
}
