package com.sample;

public class MainClass {

    public static void main(String[] args) {

        Book book1 = new Book(1, "Java 8", 800);
        Book book2 = new Book(2, "Python 3.9", 700);
        Book book3 = new Book(3, "Java 8", 800);

        System.out.println("Book1: " + book1);
        System.out.println("Book2: " + book2);
        System.out.println("Book3: " + book3);

        System.out.println(book1 == book3);
        System.out.println(book1.equals(book3));

    }

}
