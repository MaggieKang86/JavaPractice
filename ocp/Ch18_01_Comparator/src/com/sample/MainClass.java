package com.sample;

import java.util.ArrayList;
import java.util.Comparator;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(9,"Java", 500.0));
        books.add(new Book(2,"Android", 700.0));
        books.add(new Book(8,"Python", 900.0));
        books.add(new Book(4,"C++", 300.0));
        books.add(new Book(6,"MySql", 800.0));
        books.add(new Book(5,"MSSQL", 200.0));
        System.out.println(books);
        System.out.println("------------");

        books.sort(new BookIdSort());
        System.out.println(books);
        System.out.println("------------");

        books.sort(new BookPriceSort());
        System.out.println(books);
        System.out.println("------------");

    }

    // 用內部類別定義排序規則
    private static class BookPriceSort implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return new Double(o1.getPrice()).compareTo(o2.getPrice());
        }

    }

}
