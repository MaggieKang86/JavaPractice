package com.sample;

import java.util.HashSet;

public class MainClass {

    public static void main(String[] args) {

        Book book1 = new Book(1, "Java 8", 800);
        Book book2 = new Book(2, "Python 3.9", 700);
        Book book3 = new Book(1, "Java 8", 800);

        System.out.println("Book1: " + book1);
        System.out.println("Book2: " + book2);
        System.out.println("Book3: " + book3);

        System.out.println("book1 == book3: " + (book1 == book3));
        System.out.println("book1.equals(book3): " + book1.equals(book3));

        System.out.println("book1 == book2: " + (book1 == book2));
        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("--------------------");

        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book2.hashCode(): " + book2.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode());
        System.out.println("--------------------");

        HashSet<Book> set = new HashSet<>();
        set.add(book1);
        set.add(book2);
        set.add(book3);
        System.out.println(set);

    }

}
