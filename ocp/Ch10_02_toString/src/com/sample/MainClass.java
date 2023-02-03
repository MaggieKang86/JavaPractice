package com.sample;

import java.time.LocalDate;

public class MainClass {

    public static void main(String[] args) {

        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);
        System.out.println(myDate.toString());
        System.out.println("------------");

        String str = new String("Java");
        System.out.println(str);
        System.out.println(str.toString());
        System.out.println("------------");

        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append("SE");
        System.out.println(sb);
        System.out.println(sb.toString());
        System.out.println("------------");

        Book book = new Book("Java SE 8", 800);
        System.out.println(book);
        System.out.println(book.toString());

        System.out.printf("[%s,%d]%n", book.getName(), book.getPrice());

    }

}
