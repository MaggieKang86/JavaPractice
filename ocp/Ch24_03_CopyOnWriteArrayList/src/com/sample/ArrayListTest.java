package com.sample;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayListTest implements Runnable{

    private CopyOnWriteArrayList<String> wordList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        ArrayListTest test = new ArrayListTest();
        es.submit(test);
        es.submit(test);
        es.submit(test);
        es.shutdown();

        System.out.println(test.wordList);

        System.out.println("================");
        test.getArrayList()
                .stream()
                .forEach(s -> System.out.println("Item：" + s));
    }

    @Override
    public void run() {
        wordList.add("A");
        wordList.add("B");
        wordList.add("C");
    }

    public CopyOnWriteArrayList<String> getArrayList(){
        return wordList;
    }
}
