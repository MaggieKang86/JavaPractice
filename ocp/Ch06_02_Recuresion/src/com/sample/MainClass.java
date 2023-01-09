package com.sample;

public class MainClass {

    public static void main(String[] args) {
        doTest(10);
        System.out.println("\n----------------");
    }

    // main方法呼叫doTest方法時，暫時離開main，待doTest執行完之後即回到main，且doTest所產生的資料即消失(不佔記憶體)
    private static void doTest(int i) {
        System.out.printf("%3d", i);
        if (i <= 1) {
            return;  // 中斷方法執行;不可使用break(常考)
        } else {
            doTest(i - 1);
        }
        System.out.printf("%3d", i);
    }

}
