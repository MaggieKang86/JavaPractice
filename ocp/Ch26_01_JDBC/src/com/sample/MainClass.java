package com.sample;

import java.sql.*;
import java.util.Scanner;

public class MainClass implements IEmployee {

    public static void main(String[] args) {
        // 建立資料表

        try(Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            System.out.println("資料庫: " + (conn.isClosed() ? "關閉" : "連線"));  // 查看資料庫是否為關閉動作

            // 建立選單
            ResultSet rs = null;  // 用來接收使用者輸入資料後查詢的結果
            String sql = "";

            Scanner scanner = new Scanner(System.in);

            outer:   // 迴圈名字
            while (true) {
                System.out.print("----------------------\n"
                        + "1) 新增資料表\n"
                        + "2) 新增單筆紀錄\n"
                        + "3) 批次新增\n"
                        + "4) 紀錄查詢(全部)\n"
                        + "5) 紀錄查詢(依條件)\n"
                        + "6) 修改紀錄\n"
                        + "7) 刪除紀錄\n"
                        + "8) 結束\n"
                        + "----------------------\n"
                        + "==> ");
                int keyin = scanner.nextInt();
                switch (keyin) {
                    case 1:
                        // 新增資料表
                        DatabaseMetaData dmd = conn.getMetaData();
                        rs = dmd.getTables(null, null, TABLE_NAME, null);
                        if (rs.next()) {
                            System.out.println("資料表 " + TABLE_NAME + " 已存在");
                        } else {
                            sql = String.format("CREATE TABLE %s("
                                    + "%s INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),"
                                    + "%s VARCHAR(20),"  // 文字長度20
                                    + "%s VARCHAR(20),"
                                    + "%s DATE,"
                                    + "%s INT)", TABLE_NAME, ID, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                            System.out.println(sql);
                            stmt.execute(sql);     // 送出 sql 語法
                            System.out.println("資料表 " + TABLE_NAME + " 建立成功!");
                        }
                        break;
                    case 2:
                        // 新增單筆紀錄
                        sql = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Amy', 'Lee', '2001-01-02', 36000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                        int result = stmt.executeUpdate(sql);
                        System.out.println("異動筆數：" + result);
                        break;
                    case 3:
                        // 批次新增
                        String[] sqls = new String[5];
                        sqls[0] = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Haley', 'Lin', '2005-03-01', 36000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                        sqls[1] = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Duke', 'Wang', '2004-04-06', 46000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                        sqls[2] = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Jacky', 'Lee', '2003-05-07', 38000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                        sqls[3] = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Louis', 'Chen', '2002-06-08', 42000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                        sqls[4] = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Carl', 'Wang', '2001-07-09', 48000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);

                        for (String s : sqls) {
                            stmt.addBatch(s);
                        }

                        int[] results = stmt.executeBatch();

                        for (int r : results) {
                            System.out.println("異動筆數：" + r);
                        }
                        break;
                    case 4:
                        // 紀錄查詢(全部)
                        sql = "SELECT * FROM " + TABLE_NAME;
                        rs = stmt.executeQuery(sql);
                        while (rs.next()) {  // 是否有讀到第一筆資料
                            System.out.printf("%d --> %s, %s, %s, %d%n", rs.getInt(ID), rs.getString(FIRST_NAME), rs.getString(LAST_NAME), rs.getString(BIRTHDAY), rs.getInt(SALARY));
                        }
                        break;
                    case 5:
                        // 紀錄查詢(依條件)
                        //sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + LAST_NAME + "='Lee'";
                        sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + SALARY + "<40000";
                        rs = stmt.executeQuery(sql);
                        while (rs.next()) {
                            System.out.printf("%d --> %s, %s, %s, %d%n", rs.getInt(ID), rs.getString(FIRST_NAME), rs.getString(LAST_NAME), rs.getString(BIRTHDAY), rs.getInt(SALARY));
                        }
                        break;
                    case 6:
                        // 修改紀錄
                        sql = "UPDATE " + TABLE_NAME + " SET " + SALARY + "=40000 WHERE " + SALARY + " <40000";
                        result = stmt.executeUpdate(sql);
                        System.out.println("異動筆數：" + result);
                        break;
                    case 7:
                        // 刪除紀錄
                        sql = "DELETE FROM " + TABLE_NAME + " WHERE " + FIRST_NAME + "='Duke'";
                        result = stmt.executeUpdate(sql);
                        System.out.println("異動筆數：" + result);
                        break;
                    case 8:
                        // 結束
                        System.out.println("系統結束!");
                        break outer;
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
