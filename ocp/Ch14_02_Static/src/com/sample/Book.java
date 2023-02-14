package com.sample;

// 靜態引用
import static java.lang.System.out;
import static com.sample.MainClass.count;

public class Book {
    // 類別成員
    private static int id;
    // 物件成員
    private String bookId;
    private String name;

    static {
        out.printf("Book static{} count = %d%n", ++count);
    }

    public Book() {
//        System.out.printf("Book Book() count = %d%n", ++MainClass.count);
//        ++id;
//        bookId = String.format("B%02d", id);  // B01 B02
//        System.out.println("id:" + id + ",bookId: " + bookId);
    }

    public Book(String n) {

//        System.out.printf("Book Book() count = %d%n", ++MainClass.count);
//        ++id;
//        bookId = String.format("B%02d", id);  // B01 B02
//        System.out.println("id:" + id + ",bookId: " + bookId);
        name = n;
        out.println("Book Name: " + name);

    }

    // 實作區塊
    {
        out.printf("Book ##()## count = %d%n", ++count);
        out.printf("Book Book() count = %d%n", ++count);
        ++id;
        bookId = String.format("B%02d", id);  // B01 B02
        out.println("id:" + id + ",bookId: " + bookId);
    }

}
