package com.bjpowernode.javaweb.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class BServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // 獲取 ServletContext 對象
        ServletContext application = this.getServletContext();
        out.print("ServletContext對象是: " + application + "<br>");

        // 在 BServlet 取出
        Object userObj = application.getAttribute("userObj");
        // 輸出到瀏覽器
        out.print(userObj + "<br>");

        // log
        // 此 log 將自動記錄到 CATALINA_HOME/logs 內
        // application.log("大家好，我是2023最悲慘的康芝魚");

        int age = 17;
        // 當年紀小於18，表示非法並記入日誌
        if(age < 18) {
            application.log("很抱歉，您未成年！", new RuntimeException("請走開"));
        }


    }
}
