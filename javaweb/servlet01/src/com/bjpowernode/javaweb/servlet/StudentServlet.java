package com.bjpowernode.javaweb.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class StudentServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // 設定 response 內容類型
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 連接資料庫(JDBC)
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // 註冊驅動
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 獲取連接
            String url = "jdbc:mysql://localhost:3306/bjpowernode";
            String user = "root";
            String password = "root";
            conn = DriverManager.getConnection(url, user, password);

            // 獲取欲編譯的資料庫操作對象
            String sql = "select no, name from t_student";
            ps = conn.prepareStatement(sql);

            // 執行SQL
            rs = ps.executeQuery();

            // 處理結果集
            while(rs.next()) {
                String no  = rs.getString("no");
                String name = rs.getString("name");
                System.out.print(no + "," + name + "<br>");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 釋放資源
            if (rs != null) {
                try{
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
