package com.sample;

public class MainClass {

    public static void main(String[] args) {

        Person person1 = new Person.Builder().name("Amy").email("amy@xxx.xxx").build();
        System.out.println("Person1: " + person1);

        Person person2 = new Person.Builder()
                                    .city("台北")
                                    .name("Lisa")
                                    .phone("02-12345678")
                                    .age(20)
                                    .build();
        System.out.println("Person2:" + person2);

    }

}
