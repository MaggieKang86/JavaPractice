package com.sample;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainClass {

    public static void main(String[] args) {

        String temp = "This is a book. 這是一本書。售價：NT$800";

        File file = new File("test.txt"); // 檔案位置: Ch21_01 專案資料夾
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            fos.write(temp.getBytes());
            System.out.println("資料存檔完成\n-------------");
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

        // -------------------------

        try(FileInputStream fis = new FileInputStream(file)) {

            System.out.println("檔案大小: " + fis.available() + " 位元組");
//            int read;
//            while ((read = fis.read()) != -1) {
//                System.out.print((char)read);
//            }

            byte[] buff = new byte[fis.available()];  // 每次讀取多少個 byte
            int count = 0;  // 讀取了多少 byte
            while ((count = fis.read(buff)) > 0) {
                System.out.println("count: " + count);
                System.out.println(new String(buff));
            }
            System.out.println("\n資料讀取完成\n-------------");
        } catch (IOException e) {
            System.out.println(e);

        }

    }

}
