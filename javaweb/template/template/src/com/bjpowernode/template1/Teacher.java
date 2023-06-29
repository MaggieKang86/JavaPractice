package com.bjpowernode.template1;

public class Teacher {

    /*
        存在的問題：
        1. 方法沒有得到重複的使用
        2. 代碼沒有得到復用
    */

    public class Student {

        // 描述老師的一 天
        public void day() {
            getUp();
            washFace();
            eatBreakfast();
            doSome();
            eatDinner();
            sleep();
        }

        public void getUp() {
            System.out.println("起床");
        }

        public void washFace() {
            System.out.println("洗臉");
        }

        public void eatBreakfast() {
            System.out.println("吃早餐");
        }

        public void doSome() {
            System.out.println("老師正在課堂上授課，教授學生知識");
        }

        public void eatDinner() {
            System.out.println("吃晚餐");
        }

        public void sleep() {
            System.out.println("睡覺");
        }

    }
}