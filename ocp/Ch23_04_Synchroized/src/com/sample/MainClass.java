package com.sample;

import java.util.Random;

public class MainClass {

    public static void main(String[] args) {

        Company company = new Company();
        // 多個執行緒共用一個物件是不安全的執行緒
        Thread t1 = new Thread(company, "銷售員A");
        Thread t2 = new Thread(company, "銷售員B");
        Thread t3 = new Thread(company, "銷售員C");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();  // 執行緒 main 等待銷售員A 執行完成
            t2.join();  // 執行緒 main 等待銷售員B 執行完成
            t3.join();  // 執行緒 main 等待銷售員C 執行完成
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("公司存款：" + company.balance);

    }

}

// --------------------

class Company implements Runnable {

    int balance;

    @Override
    public void run() {
        for( int i = 1; i <= 3; i++) {
                runbalance();
                System.out.printf("%d. %s\tbalance = %d%n", i, Thread.currentThread().getName(), balance);
        }

    }

    private synchronized void runbalance() {
        int temp = balance;
        try {
            Thread.sleep(new Random().nextInt(1234));
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        temp += 100;
        balance = temp;
    }

}

/*
class Company implements Runnable {

    int balance;

    @Override
    public void run() {
        for( int i = 1; i <= 3; i++) {
            synchronized (this) {
                int temp = balance;
                try {
                    Thread.sleep(new Random().nextInt(1234));
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                temp += 100;
                balance = temp;
                System.out.printf("%d. %s\tbalance = %d%n", i, Thread.currentThread().getName(), balance);
            }
        }

    }
}
 */