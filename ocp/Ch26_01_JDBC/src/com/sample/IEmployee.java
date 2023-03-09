package com.sample;

public interface IEmployee {

    String url = "jdbc:derby:C:/db-derby-10.14.2.0-bin/EmployeeDB";   // 連線的主機為何
    String user = "app";  // 連線的帳號
    String password = "app"; // 連線的密碼

    String TABLE_NAME = "EMPLOYEE";
    String ID = "ID";
    String FIRST_NAME = "FIRSTNAME";
    String LAST_NAME = "LASTNAME";
    String BIRTHDAY = "BIRTHDAY";
    String SALARY = "SALARY";

}
