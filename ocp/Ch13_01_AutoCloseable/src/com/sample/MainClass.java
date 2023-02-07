package com.sample;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {

        try(Test test = new Test()) {

        } catch (Exception ex) {
            System.out.println("main() " + ex);
        }
        System.out.println("結束!");

    }

}

// ------------------------------

class Test implements AutoCloseable{

    // 一般方法
    public void display() throws IOException {
        System.out.println("Test display()...");
        throw new IOException("I/O Error!");
    }

    // 實作 AutoCloseable 介面的 close() 方法
    @Override
    public void close() throws Exception {
        System.out.println("Test close()...");
    }


}