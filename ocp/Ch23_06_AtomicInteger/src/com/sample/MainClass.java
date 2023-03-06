package com.sample;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MainClass {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(20);
        for(int i = 0; i <20; i++) {
            es.execute(new Test());
        }
        es.shutdown();
    }

}

// ----------------

 class Test implements Runnable {

    private static int i = -1;
    private static final AtomicInteger ai = new AtomicInteger();

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.printf("%-20si= %d\tai= %d%n", Thread.currentThread().getName(), ++i, ai.getAndIncrement());
    }

 }
