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
        System.out.println("s1.equalsIgnoreCase(s5)　忽略大小寫：" + s1.equalsIgnoreCase(s5));
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

        //內容不可變 aka會佔據不同記憶體
        String temp2 = a + b; //AB
        temp2 = temp2 + c; //ABC
        temp2 = temp2 + d; //ABCD
        System.out.println("temp2：" + temp2);

        //內容可變 aka僅在原先的記憶體內更改資料內容
        StringBuilder temp3 = new StringBuilder();
        temp3.append(a).append(b);  //append = 附加的意思
        temp3.append(c);
        temp3.append(d);
        System.out.println("temp3：" + temp3);

        //常用方法
        String str = " This is a book. 這是一本書。 ";
        System.out.println("012345678901234567 89 0 12 3");
        System.out.println(str);
        System.out.println("str 字串長度：" + str.length());
        System.out.println("第 10 個字元：" + str.charAt(9));
        System.out.println("轉大寫：" + str.toUpperCase());
        System.out.println("轉大寫：" + str.toLowerCase());

        //去除首尾空白
        //因String內容不可變，故需重新給值
        str = str.trim();
        System.out.println("str 字串長度：" + str.length());
        System.out.println("01234567890123456 78 90 1");
        System.out.println(str);

        System.out.println("str.substring(8)：" + str.substring(8));
        System.out.println("str.substring(8,14)：" + str.substring(8,14));
        System.out.println("是否為This開始：" + str.startsWith("This"));
        System.out.println("是否是一本書結束：" + str.endsWith("一本書。"));
        System.out.println("book開始出現的索引值：" + str.indexOf("book"));

        System.out.println("---------------");

        //使用parseXXX(String s)轉換型別：字串 -> 數字
        byte a1 = Byte.parseByte("1");//byte範圍-128~127
        short a2 = Short.parseShort("2");
        int a3 = Integer.parseInt("3");
        long a4 = Long.parseLong("4");
        float a5 = Float.parseFloat("5");
        double a6 = Double.parseDouble("6");
        System.out.println(a1 + a2 + a3 + a4 + a5 + a6);

    }

}
