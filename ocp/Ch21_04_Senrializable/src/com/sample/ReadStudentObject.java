package com.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudentObject {

    public static void main(String[] args) {
        // 反序列化
        // 當資料無參與序列化，系統會將項目給定預設值 ( Average: 0.0 ; DateTime: mull)
        try (FileInputStream fis = new FileInputStream("amy.student");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
             Student student = (Student)ois.readObject();
             System.out.println("Name: " + student.getName());
             System.out.println("Total: " + student.getTotal());
             System.out.println("Average: " + student.getAverage());
             System.out.println("DateTime: " + student.getLocalDateTime());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }



    }

}
