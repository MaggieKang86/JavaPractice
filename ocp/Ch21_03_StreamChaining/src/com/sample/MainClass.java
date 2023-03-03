package com.sample;

import java.io.*;
import java.time.LocalDateTime;

public class MainClass {

    public static void main(String[] args) {
        // 等同 Scanner 功能
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String[] input = new String[3];

        try(FileWriter fw = new FileWriter("log.txt", true);
            BufferedWriter bw = new BufferedWriter(fw)) {  // 可做整行資料的讀取、亦有換行功能

            // 接受鍵盤資料
            System.out.print("帳號: ");
            input[0] = br.readLine();
            System.out.print("密碼: ");
            input[1] = br.readLine();
            input[2] = LocalDateTime.now().toString();

            // 寫入檔案
            for(String s : input) {
                bw.write(s);
                bw.newLine();  // 換行
            }
            bw.write("-----------------");
            bw.newLine();

        } catch (IOException e) {
            System.out.println(e);
        }
        
    }

}
