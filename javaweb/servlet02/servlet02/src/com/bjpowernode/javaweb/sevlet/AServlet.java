package com.bjpowernode.javaweb.sevlet;

import javax.servlet.*;
import java.io.IOException;

public class AServlet implements Servlet {

    // 無參數構造方法
    public AServlet() {
        System.out.println("AServlet無參數構造方法執行了");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("AServlet's init method execute!");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("AServlet's service method execute!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("AServlet's destroy method execute!");
    }

}
