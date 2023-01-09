package com.sample;

public class MainClass {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setId(1);
        book1.setName("Java 8");
        book1.setPrice(800);

        System.out.printf("book1：[%d, %s, %.2f, %s]%n", book1.getId(), book1.getName(), book1.getPrice(), book1.getDate());
        System.out.println("--------------");

        Book book2 = new Book();
        System.out.printf("book2：[%d, %s, %.2f, %s]%n", book2.getId(), book2.getName(), book2.getPrice(), book2.getDate());
        System.out.println("--------------");

        Book book3 = new Book(3, "Android 10", 700);
        System.out.printf("book3：[%d, %s, %.2f, %s]%n", book3.getId(), book3.getName(), book3.getPrice(), book3.getDate());
        System.out.println("--------------");
    }

}
