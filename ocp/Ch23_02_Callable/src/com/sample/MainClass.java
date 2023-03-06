package com.sample;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MainClass {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("主方法: " + Thread.currentThread().toString());

        FutureTask<Set> task1 = new FutureTask<>(new Lotto());
        FutureTask<Set> task2 = new FutureTask<>(new Lotto());
        FutureTask<Set> task3 = new FutureTask<>(new Lotto());

        Thread t1 = new Thread(task1, "T1");  // Tread(執行XX, 為該執行緒命名)
        Thread t2 = new Thread(task2, "T2");
        Thread t3 = new Thread(task3, "T3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("T1:" + task1.get());
        System.out.println("T2:" + task2.get());
        System.out.println("T3:" + task3.get());

        System.out.println("完成！");
    }

}

// ---------------------

class Lotto implements Callable<Set> {

    @Override
    public Set call() throws Exception {
        Set<Integer> lotto = new TreeSet<>();
        while (lotto.size() < 6) {
            Thread.sleep(new Random().nextInt(1234));  // 讓執行緒休息
            int random = new Random().nextInt(49) + 1;
            System.out.printf("%s\t%02d\t%b%n", Thread.currentThread(), random, lotto.add(random));
        }
        return lotto;
    }

}