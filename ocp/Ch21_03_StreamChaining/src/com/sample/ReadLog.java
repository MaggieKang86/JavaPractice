package com.sample;

import java.io.*;

public class ReadLog {

    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.out, true);

        try(FileReader fr = new FileReader("log.txt");
            BufferedReader  br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }

        } catch (IOException e) {
            System.out.println(e);;
        }

        // ----------------

        PrintWriter out = new PrintWriter(System.out, false);  // 若值為 false 資料會存在在 temp
        out.println("AAA");
        out.println("BBB");
        out.flush();        // 強迫執行
        out.println("CCC");
        pw.println("=============");



    }

}
