package com.sample;

public class Producer extends Thread {

    private Store store;
    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for(int i = 1; i <=10; i++) {
            try {
                store.producer(4); // 庫存增加4
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}
