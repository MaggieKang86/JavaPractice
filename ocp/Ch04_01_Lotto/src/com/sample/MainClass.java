package com.sample;

import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        /*
        思考如何製作：
        Step1：使用巢狀迴圈產生號碼
        Step2：使用巢狀迴圈檢查是否重複
               1.無，進行Step3
               2.有，則使用break到最外層迴圈重新產生號碼
                 檢查挑出的6個數字是否重複的方式：
                 外 內
                 [0][1] [1][2] [2][3] [3][4] [4][5]
                 [0][2] [1][3] [2][4] [3][5]
                 [0][3] [1][4] [2][5]
                 [0][4] [1][5]
                 [0][5]
        Step3：產生6個不同數字後，使用"宣告臨時變數"去排順序
          *若Step2+3產生不滿意的結果，使用do-while去重複Step2+3
        Step4：排出順序後印出
        */

        // 宣告整數陣列長度6
        int[] lotto = new int[6];
        boolean boo;
        // 產生不滿意的結果，使用do-while去重複執行到滿意
        do {
            boo = false; // 先設定boo為false代表數字沒有重複
            // 使用巢狀迴圈產生號碼
            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = new Random().nextInt(49) + 1; // 產生亂數1~49中任意整數
            }

            // 幫迴圈命名
            outer:
            // 使用巢狀迴圈檢查是否重複
            // 產生6個不同數字後，使用"宣告臨時變數"去排順序
            for (int i = 0; i < lotto.length - 1; i++) {
                for (int j = i + 1; j < lotto.length; j++) {
                    //檢查重複
                    if (lotto[i] == lotto[j]) {
                        System.out.printf("%02d --> 索引位置 [%d] 和 [%d] 相同%n", lotto[j], i, j);
                        boo = true; // true代表數字有重複
                        break outer; // 檢查若有重複乙次數字時，即中斷最外層迴圈outer並重頭來
                    }
                    //比較大小
                    if (lotto[i] > lotto[j]) {
                        int temp = lotto[i];
                        lotto[i] = lotto[j];
                        lotto[j] = temp;
                    }
                }
            }
            System.out.println("----");
        } while (boo); // 如果boo為true，do-while重新執行

        // 顯示號碼：使用增強型迴圈來顯示陣列內容
        for (int i : lotto) {
            System.out.printf("%02d | ", i);
        }
    }

}
