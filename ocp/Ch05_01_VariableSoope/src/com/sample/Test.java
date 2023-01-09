package com.sample;

public class Test {

    // 方法
    public void setItem(String i) {  // 參數 i 有效範圍開始
        System.out.println("i = " + i);

        // System.out.println("temp = " + temp); 因為 temp 尚未給值
        String temp = "項目：" + i;  // 區域變數 temp 有效範圍開始
        System.out.println("temp = " + temp);

        item = "# " + temp;
        System.out.println("item = " + item);
    } // 參數 i 有效範圍結束、區域變數 temp 有效範圍結束

    public String getItem() {
        // System.out.println("i = " + i);  此方法無 i 值可使用
        return item;
    }

    // 宣告欄位：類別內、方法外
    private String item;

}
