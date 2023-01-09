package com.sample;

public class MainClass {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.printf("1. a = %d, b = %d%n", a, b);

        ++a;  // ++a = a + 1 = 11
        System.out.printf("2. a = %d, b = %d%n", a, b);

        doTest(a);
        System.out.printf("5. a = %d%n", a);
        System.out.println("-------------------");

        Book book = new Book();
        book.name = "Java 8";
        book.price = 800;
        System.out.printf("6. %s --> %d%n", book.name, book.price);

        doTest(book);
        System.out.printf("9. %s --> %d%n", book.name, book.price);
        System.out.println("-------------------");

        String temp = "Java SE 8";
        System.out.println("A. temp = " + temp);

        doTest(temp);
        System.out.println("D. temp = " + temp);
    }

    private static void doTest(String temp) {
        System.out.println("B. temp = " + temp);
        temp = "Python 3.9";
        System.out.println("C. temp = " + temp);
    }

    private static void doTest(Book book) {
        System.out.printf("7. %s --> %d%n", book.name, book.price);
        book.price = 850;
        System.out.printf("8. %s --> %d%n", book.name, book.price);
    }

    private static void doTest(int a) {
        System.out.printf("3. a = %d%n", a);
        ++a;
        System.out.printf("4. a = %d%n", a);
    }

}
