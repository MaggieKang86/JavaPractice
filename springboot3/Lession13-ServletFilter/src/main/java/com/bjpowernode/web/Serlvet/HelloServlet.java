package com.bjpowernode.web.Serlvet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/*
    @WebSerlvet：等同於 web.xml 中有關 Servlet 的聲明
    <servlet>
        <servlet-name>HelloServlet</servlet-name>
        <servlet-class>xxxx</servlet-class>
    </servlet>
    <servlet-mapping>
        <url-pattern>/helloServlet</url-pattern>
    </servlet-mapping>
*/
@WebServlet(urlPatterns = "/helloServlet", name = "HelloServlet")  // 用來聲明此類為乙個 Servlet
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset = UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("這是一個 Springboot 中的 Servlet");
        // 清空輸出的緩存
        out.flush();
        // 關閉
        out.close();
    }

}
