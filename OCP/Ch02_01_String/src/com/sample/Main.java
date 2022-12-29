package com.sample;

public class Main {

    public static void main(String[] args) {
        // String(類別，字串使用一對雙引號["文字"]
        String s1 = "JAVA";
        String s2 = "java";
        String s3 = "java"; // 比較建議使用以上三種，節省記憶體空間
        String s4 = new String("java");
        String s5 = new String("java");
        System.out.println("s2 == s3:" + (s2 == s3)); // true
        System.out.println("s4 == s5:" + (s4 == s5)); // false

        // 比較字串內容
        System.out.println("s1.equals(s5)　大小寫不同：" + s1.equals(s5));
        System.out.println("s1.equals(s5)　忽略大小寫：" + s1.equalsIgnoreCase(s5));
        System.out.println("-------------------");

        // 字串串接
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";

        // a + b;   // 編譯失敗原因： + 的左邊沒有 = 號
        String temp1 = a + b; // a + b串接再交給temp1
        System.out.println("1. temp1：" + temp1); // AB
        temp1.concat(c); // 此字串串接功能有執行，亦有創造出ABC的資料，但並無將temp1指向該資料，故print出來一樣是AB
        System.out.println("2. temp1：" + temp1); // AB
        temp1 = temp1.concat(c); // 這樣將上方創造出ABC資料給temp1，方能print出ABC
        System.out.println("3. temp1：" + temp1); // ABC
    }

}
