package com.sample;

import java.io.*;

public class MainClass {

    public static void main(String[] args) {

        String temp = "This is a book. 這是一本書。售價：NT$800";

        File file = new File("test.txt"); // 檔案位置: Ch21_02 專案資料夾

        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file)) {
            // 儲存
            fw.write(temp);
            System.out.println("資料存檔完成\n-------------");

            // 資料理應在 close 的時候才會把資料從 temp 存到檔案裡
            // 這裡可使用 flush 來強制將資料寫入檔案裡
            fw.flush();

            // 讀取
            int read;
            while ((read = fr.read()) != -1) {
                System.out.print((char)read);
            }
            System.out.println("\n資料讀取完成\n-------------");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
