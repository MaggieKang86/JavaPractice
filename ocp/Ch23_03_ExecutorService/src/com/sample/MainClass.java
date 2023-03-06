package com.sample;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(4);

        for(int i = 1; i <= 15; i++) {
            int NUM = i;
            es.execute(new Runnable() {
                @Override
                public void run() {
                    int time = new Random().nextInt(5000);
                    System.out.println(Thread.currentThread() + "\t" + NUM + "\t" + time);
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            });
        }
        es.shutdown();

    }

}
