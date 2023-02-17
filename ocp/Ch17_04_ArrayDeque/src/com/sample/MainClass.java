package com.sample;

import java.util.ArrayDeque;

public class MainClass {

    public static void main(String[] args) {

        ArrayDeque<String> fifo = new ArrayDeque<>();
        fifo.add("Kiwi");
        fifo.add("Apple");
        fifo.add("Orange");
        fifo.add("Banana");
        fifo.add("Apple");
        System.out.println("fifo: " + fifo);
        System.out.println();

        // 取出不移除 peek()
        System.out.println("取出不移除 peek(): " + fifo.peek());
        System.out.println("fifo: " + fifo);
        System.out.println();

        // 取出並移除 remove()
//        System.out.println("取出並移除 remove()" + fifo.remove());
//        System.out.println("取出並移除 remove()" + fifo.remove());
//        System.out.println("取出並移除 remove()" + fifo.remove());
//        System.out.println("取出並移除 remove()" + fifo.remove());
//        System.out.println("取出並移除 remove()" + fifo.remove());
//        System.out.println("取出並移除 remove()" + fifo.remove());  // 若已沒有資料還繼續取出，會產生例外

        // 取出並移除 poll()
        System.out.println("取出並移除 poll(): " + fifo.poll());
        System.out.println("取出並移除 poll(): " + fifo.poll());
        System.out.println("取出並移除 poll(): " + fifo.poll());
        System.out.println("取出並移除 poll(): " + fifo.poll());
        System.out.println("取出並移除 poll(): " + fifo.poll());
        System.out.println("取出並移除 poll(): " + fifo.poll());
        System.out.println("fifo: " + fifo);
        System.out.println("----------------");

        ArrayDeque<String> lifo = new ArrayDeque<>();
        lifo.push("Kiwi");
        lifo.push("Apple");
        lifo.push("Orange");
        lifo.push("Banana");
        lifo.push("Apple");
        System.out.println("lifo: " + lifo);
        System.out.println();

        while (lifo.size() > 0) {
            System.out.println("pop(): " + lifo.pop());
        }
        System.out.println("lifo: " + lifo);

    }

}
