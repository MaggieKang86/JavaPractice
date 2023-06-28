package com.bjpowernode.template1;

public class Student {

    // 描述學生的一 天
    public void day(){
        getUp();
        washFace();
        eatBreakfast();
        doSome();
        eatDinner();
        sleep();
    }

    public void getUp(){
        System.out.println("起床");
    }

    public void washFace(){
        System.out.println("洗臉");
    }

    public void eatBreakfast(){
        System.out.println("吃早餐");
    }

    public void doSome(){
        System.out.println("學生上學、學習");
    }

    public void eatDinner(){
        System.out.println("吃晚餐");
    }

    public void sleep(){
        System.out.println("睡覺");
    }

}
