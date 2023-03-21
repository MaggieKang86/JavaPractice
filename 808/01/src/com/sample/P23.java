package com.sample;

public class P23 {

    public static void main(String[] args) {

        // line n1
        Byte x = 1;
        // short x = 1;
        //Integer x = new Integer("1");

        // String x = "1";  // 此 1 為字串，與下方case的數字 1 不同

        switch(x) {  // 比對參數可為：byte(Byte) / short(Short) / int(Integer) / String
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;
        }

    }

}
