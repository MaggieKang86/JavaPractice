package com.sample;

import java.util.TreeSet;

public class MainClass {

    public static void main(String[] args) {

        TreeSet<String> strSet = new TreeSet<>();
        strSet.add("一");
        strSet.add("二");
        strSet.add("三");
        strSet.add("四");
        strSet.add("五");
        System.out.println("strSet: " + strSet);
        System.out.println("-------------");

        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book(9,"Java", 500.0));
        books.add(new Book(2,"Android", 700.0));
        books.add(new Book(8,"Python", 900.0));
        books.add(new Book(4,"C++", 300.0));
        books.add(new Book(6,"MySql", 800.0));
        books.add(new Book(5,"MSSQL", 200.0));
        System.out.println(books);

    }

}
