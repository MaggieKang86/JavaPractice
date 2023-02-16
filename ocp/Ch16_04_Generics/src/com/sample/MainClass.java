package com.sample;

public class MainClass {

    public static void main(String[] args) {

        // 建立 UseAny 物件時沒有指定 T 型別，T 則以 Object 型別來處理資料
        UseAny u1 = new UseAny();
        u1.add(100);
                                    // 取出的資料為 Object 型別，不可直接用來計算，必須轉型為原來資料型別
        System.out.println("u1: " + (int)u1.get() * 2);
        System.out.println("--------------------");

        // 建立 UseAny 物件時，指定 T 型別
        UseAny<Integer> u2 = new UseAny<Integer> ();
        u2.add(100);
        System.out.println("u2: " + u2.get() * 2);
        System.out.println("--------------------");

        UseAny<String> u3 = new UseAny<>();  // Java SE 7 以後，new UseAny<>() 的 <> 內型別可省略
        u3.add("Java");
        System.out.println("u3: " + u3.get().toUpperCase());
        System.out.println("--------------------");

        UseAny<Double> u4 = new UseAny();
        u4.add(1.23);
        System.out.println("u4: " + u4.get() * 100);

    }

}


// -----------------

class UseAny <T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}