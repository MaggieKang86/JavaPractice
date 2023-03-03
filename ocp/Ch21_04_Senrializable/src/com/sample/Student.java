package com.sample;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Student implements Serializable {

    private String name;
    private int total;
    private double average;
    private LocalDateTime localDateTime = LocalDateTime.now();

    public Student(String name) {
        this.name = name;
    }

    public void setScore(int... scores) {  // int... 可變動參數
        for(int s : scores) {
            total += s;
        }
        average = total / scores.length;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

}
