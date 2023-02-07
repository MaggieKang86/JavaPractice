package com.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MainClass {

    public static void main(String[] args) {

        /*
        FileInputStream fis = null;
        try {
            doTest();
            fis = new FileInputStream("test.txt");
        } catch (SQLException | IOException ex) {  // 多重捕捉 Catching Multiple Exception
            System.out.println(ex);
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        */

        try(FileInputStream fis = new FileInputStream("test.txt")) {  // try-with-resourcese
            doTest();
        } catch (SQLException | IOException ex) {  // Catching Multiple Exception
            System.out.println(ex);
        }
        System.out.println("其他程式....");
    }

    private static void doTest() throws SQLException, IOException {
        double random = Math.random();
        if (random < 0.35) {
            throw new SQLException("無法開啟資料庫!");
        } else if(random < 0.7) {
            throw new IOException("無法開啟檔案!");
        } else {
            System.out.println("系統運作正常...");
        }
    }

}
