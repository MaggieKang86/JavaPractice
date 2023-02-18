package com.sample;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class MainClass {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.size() < 6) {
            int random = new Random().nextInt(49) + 1;
            System.out.printf("加入 %02d -> %2b%n", random, hashSet.add(random));
        }
        System.out.println("下注號碼: " + hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        while(treeSet.size() < 6) {
            treeSet.add(new Random().nextInt(49) + 1);
        }
        System.out.println("開獎號碼: " + treeSet.toString());

        // --------------------

        int count = 0;
        String msg = "";

        for(int i : treeSet) {
            if(hashSet.contains(i)) {
                count++;
                msg = msg + String.format("%02d ", i);
            }
        }
        System.out.printf("中獎號碼: %s 共 %d 個 %n", msg, count);

    }

}
