package com.bjpowernode.javaweb.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RequestTestServlet extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        // org.apache.catalina.connection.RequestFacade@642e8513
//        out.print(request);
//
//        // 獲取客戶端的 IP 地址
//        String remoteAddr = request.getRemoteAddr();
//        System.out.println("客戶端的 IP 地址" + remoteAddr);
//
//    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 這是 POST 請求
        String username = request.getParameter("username");
        // 輸出這個用戶提交的用戶名
        System.out.println(username);


    }

}
