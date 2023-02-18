package com.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(new Integer(1111));  // Java 5.0 前 boxing 裝箱
        list.add(2222);                    // Java 5.0 開始 autoboxing 自動裝箱，int -> Integer.valueOf(2222)
        list.add(Integer.valueOf(3333));
        list.add(Integer.valueOf("4444"));
        list.add(5555);
        System.out.println("list: " + list);

        int total = 0;
        for(int i = 0; i < list.size(); i++) {
            Integer wInt = list.get(i);
            int pInt = wInt.intValue(); // Java 5.0 前 unboxing 拆箱(將資料轉回 int)
            total += pInt;
        }
        System.out.println("total: " + total);

        // -----------------------

        total = 0;
        for(Integer wInt : list) {
            int pInt = wInt; // Java 5.0 開始 autounboxing 自動拆箱(將資料轉回 int)
            total += pInt;
        }
        System.out.println("total: " + total);

        // -----------------------

        total = 0;
        for(int i : list) {   // Java 5.0 開始 autounboxing 自動拆箱(將資料轉回 int)
            total += i;
        }
        System.out.println("total: " + total);

        // -----------------------

        // 使用迭代器
        total = 0;
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int i = iterator.next();  // Java 5.0 開始 autounboxing 自動拆箱
            System.out.printf("%d | ", i);
            total += i;
        }
        System.out.println("\ntotal: " + total);


    }

}
