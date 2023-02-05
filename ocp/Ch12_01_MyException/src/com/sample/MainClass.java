package com.sample;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {

        try {
            doTest();
        } catch (IOException e) {
            System.out.println("main(): " + e);
        }

    }

    private static void doTest() throws IOException {

        double random = new Random().nextDouble();
        System.out.println("random: " + random);

        if(random >= 0.8) {
            // 建立 ArithmeticException 例外物件 ( Unchecked exception )
            throw new ArithmeticException("除數不可為0");
        } else if(random >= 0.6) {
            // 建立 IOException 例外物件 ( checked exception )
            throw new IOException("自訂例外訊息: @_@ I/O 錯誤");  // 利用 throws 將例外物件拋給呼叫端
        } else if(random >= 0.4) {
            try {
                // 建立 SQLException 例外物件 ( checked exception )
                throw new SQLException("SOL 錯誤");             // 利用 try-catch 自行處理
            } catch (SQLException ex) {
                System.out.println("事件紀錄完成");
            }

        }

    }

}
