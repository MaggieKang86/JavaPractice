package com.sample;

public class P20 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        // in the order of entry 按順序印出
        // standard for loop 一般迴圈
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println();
        // enhanced for loop 增強型迴圈
        for(int a : array) {
            System.out.print(a + "");
        }
        System.out.println();

    //------------------------------------------------

        // int the reverse of entry 反序印出
        // standard for loop 一般迴圈
        for(int x = array.length-1; x >= 0; x--) {
            System.out.print(array[x] + "");
        }
        System.out.println();

        // enhanced for loop 增強型迴圈
        // 不可操作！！ enhanced for loop 固定從 0 開始跑 故無法使用增強型迴圈印出反序

    //------------------------------------------------

        // alternating elements 元素交替
        // 將 [1] <-> [3]
        // 1 2 3 4 5 -> 1 4 3 2 5
        int n1 = 0;
        int n3 = 0;
        for(int i = 0; i < array.length; i++) {
            if(i == 1) n1 = array[i] ;
            if(i == 3) n3 = array[i];
        }
        for(int i = 0; i < array.length; i++) {
            if(i == 3) array[i] = n1;
            if(i == 1) array[i] = n3;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }
        System.out.println();

        // enhanced for loop 增強型迴圈
        // 無法達到

    }

}
