package com.sample;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MainClass {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i = 1; i <= 20; i++) {
            es.execute(new Test());
        }
        es.shutdown();
    }

}

// ---------------------

class Test implements Runnable {

    private static final AtomicInteger ai = new AtomicInteger();
    private static final CyclicBarrier cb = new CyclicBarrier(5);

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(500));
            System.out.println(Thread.currentThread().getName() + "\tai= " + ai.getAndIncrement() + " 就定位");
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() +  " 起跑！");
    }

}