package com.bjpowernode.javaweb.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RequestTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        // org.apache.catalina.connection.RequestFacade@642e8513
//        out.print(request);
//
//        // 獲取客戶端的 IP 地址
//        String remoteAddr = request.getRemoteAddr();
//        System.out.println("客戶端的 IP 地址" + remoteAddr);

        // 這個方法使用比較多 (動態獲取應用的根路徑)
        String contextPath = request.getContextPath();
        System.out.println("應用的根路徑:" + contextPath);

        // 獲取請求方式
        String method = request.getMethod();
        System.out.println(method);  // GET

        // 獲取請求的 URI
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);  //  /aaa/testRequest

        // 獲取 servlet 路徑
        String servletPath = request.getServletPath();
        System.out.println(servletPath);

    }



//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        // 這是 POST 請求
//        String username = request.getParameter("username");
//        // 輸出這個用戶提交的用戶名
//        System.out.println(username);
//
//    }

}
