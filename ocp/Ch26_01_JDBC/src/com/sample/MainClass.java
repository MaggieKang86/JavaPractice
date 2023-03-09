package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass implements IEmployee {

    public static void main(String[] args) {
        // 建立資料表

        try(Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
