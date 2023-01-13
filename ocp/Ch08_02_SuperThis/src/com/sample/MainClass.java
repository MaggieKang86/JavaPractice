package com.sample;

public class MainClass {

    public static void main(String[] args) {

        SubClass sub1 = new SubClass("Java");
        sub1.display();
        System.out.println("-----------");
        SubClass sub2 = new SubClass("Python", 1);
        sub2.display();
    }

}

// ---------------------------------------------------
class SuperClass {

    private String item;

    public SuperClass(String item) {
        this.item = item;
    }

    public void display() {
        System.out.println("SuperClass display() item:" + item);
    }
}

class SubClass extends SuperClass {

    public int temp;

    public SubClass(String item) {
        super(item);
        System.out.println("連線資料庫...");
        System.out.println("驗證帳號...");
        System.out.println("程式1執行...");
        System.out.println("程式2執行...");
        System.out.println("程式3執行...");
    }

    public SubClass(String item, int temp) {
        /*
        super(item);
        System.out.println("連線資料庫...");
        System.out.println("驗證帳號...");
        System.out.println("程式1執行...");
        System.out.println("程式2執行...");
        System.out.println("程式3執行...");
         */
        this(item);  // 因為上方SubClass有相同的建構子內容，利用this呼叫其重複內容協助執行
        this.temp = temp;
    }

    // 因上方父類別提供的功能不夠，故改寫，使其符合需求(父類別本身還在)
    public void display() {
        super.display();
        System.out.println("SubClass display() temp:" + temp);
    }


}