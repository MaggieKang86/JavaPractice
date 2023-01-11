package com.sample;

public class MainClass {

    public static void main(String[] args) {

        SubClass sub1 = new SubClass("Java");
        sub1.display();
        System.out.println("-----------");
    }

}

 // ---------------------------------------------------
 class SuperClass{

    private String item;

    public SuperClass(String item) {
        this.item = item;
    }

    public void display() {
        System.out.println("SuperClass display() item:" + item);
    }
 }

 class SubClass extends SuperClass{

    public SubClass(String item) {
         super(item);
     }
 }