package com.bjpowernode.javaweb.sevlet;

import javax.servlet.*;
import java.io.IOException;

public class BServlet implements Servlet {

    // 無參數構造方法
    public BServlet() {
        System.out.println("BServlet無參數構造方法執行了");
    }


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
