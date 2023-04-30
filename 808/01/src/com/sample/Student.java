package com.sample;

enum Language {
    CHINESE("Chunese"), ENGLISH("English"), JAPANESE("Japanese");

    private final String name;

    private Language(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

}

public class Student {

    String name;

    public static String getName(String name) {
        return name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.printf("我叫做:%s, 主修:%s\n", Student.getName("Maggie"), Language.ENGLISH.getName("English"));
    }

}
