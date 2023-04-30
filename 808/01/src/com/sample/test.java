package com.sample;

import org.w3c.dom.ls.LSOutput;

public class test {

    public static void main(String[] args) {


        // for迴圈
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("使用for迴圈將1~100加總 = " + sum);

        // while迴圈
        int i = 1;
        int sum1 = 0;
        while(i <= 100) {
            sum1 += i;
            i++;
        }
        System.out.println("使用while迴圈將1~100加總 = " + sum1);

        // do while迴圈
        int x = 1;
        int sum2 = 0;
        do{
            sum2 += x;
            x++;
        } while(x <= 100);
        System.out.println("使用do while迴圈將1~100加總 = " + sum2);

        //===========================================================

        /*
        a. 年齡小於 20 歲，回傳青少年
        b. 年齡小於 30 歲，20 歲以上，回傳壯年
        c. 年齡小於 50 歲，30 歲以上，回傳中年
        d. 年齡大於 50 歲以上，回傳老年
         */

        // If … else 判斷式
        int age = 20;
        if(age < 20) {
            System.out.println("使用if else判斷式：青少年");
        } else if (age < 30) {
            System.out.println("使用if else判斷式：壯年");
        } else if (age < 50) {
            System.out.println("使用if else判斷式：中年");
        } else {
            System.out.println("使用if else判斷式：老年");
        }

        // Switch case判斷式
        String age1 = null;
        switch(age / 10) {
            case 0:
            case 1:
                age1 = "青壯年";
                break;
            case 2:
                age1 = "壯年";
                break;
            case 3:
            case 4:
                age1 = "中年";
                break;
            default:
                age1 = "老年";
        }
        System.out.println("使用switch case判斷式：" + age1);

        //===========================================================

        // Encapsulation
        class Person {
            private String name;
            private int age;
            private int salary;

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
            public int getAge() { return age; }
            public void setAge(int age) { this.age = age; }
            public int getSalary() { return salary; }
            public void setSalary(int salary) { this.salary = salary; }
        }

        Person person = new Person();
        person.name = "Maggie";
        person.age = 26;
        person.salary = 3000;
        System.out.printf("我叫%s, 今年%d歲, 薪水少的可憐只有%d元月薪。\n",person.getName(), person.getAge(), person.getSalary());

        System.out.println();

        // Extends & Polymorphism
        abstract class Animal {
            private String name;
            public Animal(String nme) {
                this.name = name;
            }
            public abstract void eat();
            public abstract void makeSound();
        }

        class Cat extends Animal {
            public Cat(String name) {
                super(name);
                System.out.println("我的名字叫做：" + name);
            }
            public void eat() {
                System.out.print("我吃飯細嚼慢嚥的");
            }
            public void makeSound() {
                System.out.println("喵喵喵");
            }
        }

        class Dog extends Animal {
            public Dog(String name) {
                super(name);
                System.out.println("我的名字叫做：" + name);
            }
            public void eat() { System.out.print("我吃飯狼吞虎嚥的"); }
            public void makeSound() { System.out.print("汪汪汪"); }
        }

        Cat cat = new Cat("Naruto");
        cat.eat();
        cat.makeSound();

        Dog dog = new Dog("小朋友");
        dog.eat();
        dog.makeSound();
        System.out.println();

        // ======================================================

        class Test1<T> {
            private T x;
            public T getX() {
                return x;
            }
            public void setX(T x) {
                this.x = x;
            }
        }

        Test1<Integer> test1 = new Test1<Integer>();
        test1.setX(100);
        System.out.println(test1.getX());

        // ======================================================

        String num = new String("100");
        String num1 = new String("100");
        System.out.println(num == num1);
        System.out.println(num.equals(num1));


        // ======================================================




    }
}
