package com.bjpowernode.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 代碼隨意
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>登入成功</h1>");
    }
}
