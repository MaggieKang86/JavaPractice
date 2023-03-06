package com.sample;

public class Store {

    private int stock = 0;
    public synchronized void producer(int qty) throws InterruptedException {
        while(stock > 20) {
            System.out.println("庫存超過20，暫停出貨");
            wait();
        }
        stock += qty;
        notify();
        System.out.printf("進貨數量：%d | 庫存：%d%n", qty, stock);
    }

    public synchronized void consumer(int qty) throws InterruptedException {
        while (stock < qty) {
            System.out.println("庫存不足，暫停購買！");
            wait();
        }
        stock -= qty;
        System.out.printf("銷售數量：%d | 庫存：%d%n", qty, stock);
        if(stock < 5) {
            System.out.println("庫存量過低，請通知工廠出貨！");
            notify();
        }
    }

}
