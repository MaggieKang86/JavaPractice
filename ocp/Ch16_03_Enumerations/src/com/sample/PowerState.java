package com.sample;

public enum PowerState {

    // 宣告列舉值(常數，不可變)，必須寫在程式的最前面
    // 若建構子有需要參數，參數須由列舉值提供
    OFF("關閉"), ON("開啟"), SUSPEND("暫停");

    // 欄位
    private String state;

    // 建構子: 必須是 private，因為實作列舉物件是禁止的
    // public PowerState() { }
    private PowerState(String state) {
        this.state = state;
    }

    // 方法
    @Override
    public String toString() {
        return "電源" + state;
    }

}
