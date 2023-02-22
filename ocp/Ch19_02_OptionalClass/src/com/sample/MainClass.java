package com.sample;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class MainClass {

    public static void main(String[] args) {

//        String s = null;
//        System.out.println(s.toUpperCase()); // NullPointerException

        String bookName_1 = getStringBookName("A02");
        System.out.println("1. bookName_1: " + bookName_1);
        if(bookName_1 != null) {
            System.out.println("2. bookName_1: " + bookName_1.toUpperCase());
        } else {
            System.out.println("2. bookName_1: 找不到相關書籍");
        }
        System.out.println("----------------");

        Optional<String> oBookName_2 = getOptionalBookName("B01");
        System.out.println("先查看 Optional<String> oBookName_2: " + oBookName_2);

        // 取出資料: get() 只處裡非 empty
        // System.out.println("get() oBookName_2: " + oBookName_2.get());

        // isPresent() 先判別是否是 empty
        if(oBookName_2.isPresent()) {
            System.out.println("get() oBookName_2: " + oBookName_2.get());
        } else {
            System.out.println("get() oBookName_2: 找不到相關書籍");
        }
        System.out.println("----------------");

        // 取出資料: orElse() 可處裡非 empty
        System.out.println("orElse() oBookName_2: " + oBookName_2.orElse("找不到相關書籍"));

    }

    // -------------------

    public static String getStringBookName(String key) {

        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("A01", "Java SE 8");
        bookMap.put("B02", "Python 3.9");
        bookMap.put("C03", "Android 10");
        String bookName = bookMap.get(key);
        System.out.println("bookMap: " + bookName);
        return bookName;

    }

    public static Optional<String> getOptionalBookName(String key) {

        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("A01", "Java SE 8");
        bookMap.put("B02", "Python 3.9");
        bookMap.put("C03", "Android 10");

        // Optional.of() 只處理非 null 的資料並回傳 Optional 物件
        // return Optional.of(bookMap.get(key));

        // Optional.ofNullable() 可處理非 null 的資料並回傳 Optional 物件
        return Optional.ofNullable(bookMap.get(key));

    }

}
