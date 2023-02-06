package com.sample;

// 自訂例外型別
// 必須繼承一個例外父類別
public class MyException extends Exception {

    // 欄位
    private int errNum;

    // 建構子
    public MyException(int errNum, String message) {
        super(message);
        this.errNum = errNum;
    }

    // 方法
    @Override
    public String toString() {
        return "系統發生錯誤，代碼: " + errNum + "，請將錯誤代碼告知系統管理員";
    }

}
