package com.bjpowernode.template2;

/*
Teacher 和 Student 都是 Person
1. Person 就是模板方法設計模式當中的模板類
2. day() 方法就是模板方法設計模式當中的模板方法
 */

// 模板類通常是抽象類 (因為有抽象方法)
public abstract class Person {

    // 模板方法
    // 添加了 final 之後，這個算法無法被覆蓋，這樣核心的方法也可以得到保護
    // 模板方法定義核心的方法骨架，具體的實現步驟可以延遲到子類當中去實現
    // 核心算法一放面是得到了保護，不能被改變。另一方面就是算法得到了重複使用
    // 另外代碼也得到了復用，因為算法中某些步驟的代碼都是固定的。這些固定的代碼不會隨著子類的變化而變換，這一部分代碼可以寫到模板類當中
    public final void day(){
        getUp();
        washFace();
        eatBreakfast();
        doSome();
        eatDinner();
        sleep();
    }

        // 其中的某些步驟，不會隨著子類的變化而變化，這些代碼可以寫到父類中，得到代碼復用。
    public void getUp(){
            System.out.println("起床");
        }
    public void washFace(){
            System.out.println("洗臉");
        }
    public void eatBreakfast(){
            System.out.println("吃早餐");
        }

    // 這一步一定要做，但具體怎麼做是由子類定義。
    public abstract void doSome();
    public void eatDinner(){
            System.out.println("吃晚餐");
        }
    public void sleep() {
            System.out.println("睡覺");
        }
        
}
