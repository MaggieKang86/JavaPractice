package com.sample;

import java.util.Locale;

public class Test {

    // 類別成員(static)
    public static void staticTest(String s) {
        System.out.println(s.toUpperCase() + " | ");
    }

    // 類別成員
    public void instanceTest(String s) {
        System.out.printf("%s%n", s);
    }

}
