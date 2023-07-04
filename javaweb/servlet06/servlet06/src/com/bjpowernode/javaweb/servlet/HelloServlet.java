package com.bjpowernode.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    // 通過無參數構造方法創建對象
    /*
    public HelloServlet(){
    }
    */

    // 沒有提供 init 方法，那麼必然執行父類 HttpServlet 的 init 方法
    // HttpServlet 類中沒有 init 方法，會繼續執行 GenericServlet 類中的 init 方法

    // 沒有提供 service 方法。 那麼必然執行父類 HttpServlet 類 service 方法

    /*@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>Hello Servlet</h1>");
    }*/

    // 當前端發送的請求是get請求的時候，這裡重寫doGet方法
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<h1>doGet</h1>");
    }
    // 當前端發送的請求是post請求的時候，這裡重寫doPost方法
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<h1>doPost</h1>");
    }

}
