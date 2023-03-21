package com.sample;

public class P24 {

    public static void main(String[] args) {

        String ta = "A";
        ta = ta.concat("B");  // 列出另一個資料為 AB，與原先 ta 指向的 "A" 不同
        String tb = "C";
        ta = ta.concat(tb);   // 列出另一個資料為 ABC，與原先 ta 指向的 "AB" 不同
        ta.replace("C", "D");  // 雖然將原先的 ABC 換成 ABD，但並無將值給 ta，故 ta 仍為 ABC
        ta = ta.concat(tb);   // ta = "ABC" 再連接 tb = "C"，故 ta = "ABCC"
        System.out.println(ta);

    }

}
