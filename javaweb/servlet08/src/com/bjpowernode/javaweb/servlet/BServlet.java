package com.bjpowernode.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 從請求域當中取出綁定的數據
        Object sysTime = request.getAttribute("sysTime");

        // 輸出到瀏覽器
        response.setContentType("text/hmtl");
        PrintWriter out = response.getWriter();
        out.print("系統當前時間是：" + sysTime);

    }
}
