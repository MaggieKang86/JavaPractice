package com.sample;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        while(true) {
            list.add("OutOfMemorryError");
            if(list.size() % 1000000 == 0) {
                System.out.println("list 元素個數: " + list.size()/1000000 + " 百萬筆");
            }
        }

    }
}
