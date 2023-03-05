package com.sample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainClass {

    public static void main(String[] args) {

        Student student = new Student("Amy");
        student.setScore(90, 80, 70);
        System.out.printf("%s, %d, %.2f, %s%n", student.getName(), student.getTotal(), student.getAverage(), student.getLocalDateTime());

        // -------
        // 進行序列化
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("amy.student"))) {
            oos.writeObject(student);
            System.out.println("資料儲存成功！");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
