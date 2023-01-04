// 套件區
package com.sample;

// import 區
import java.util.Date;

/**
 * 說明文件
 *
 * @author
 */
// 類別區
// MainClass 是主類別
public class MainClass {

    // 主方法(程式進入點)
    public static void main(String[] args) {
        // 敘述句，結束必須使用【;】結束
        System.out.println(new Date());  //建立日期物件並顯示
        // 快速鍵 sout<tab>

        // 區域變數
        // [語法]型別 變數名稱 = 值;
        // byte short int long
        int max = 2147483647;
        // double float
        double pi = 3.14;
        // char
        char ch1 = '熱';
        char ch2 = '\u5496';
        char ch3 = '\u5561';
        // boolean:true/false
        boolean boo = 5 > 3;
        System.out.println(max);
        System.out.println(pi);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(boo);
    }

}
