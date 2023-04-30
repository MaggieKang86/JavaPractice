package com.bjpowernode.javaweb.sevlet;

import javax.servlet.*;
import java.io.IOException;

/*
編寫一個標準通用的 Servlet，命名為：GenericServlet
以後所有的 Servlet class 都不必 implements Servlet interface 了
以後所有的 Servlet class 都要 extends GenericServlet class
GenericServlet 就是一個適配器
 */
public abstract class GenericServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /*
    此方法最常用，故要求子類必須實現 service 方法
     */
    @Override
    public abstract void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException ;

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

}
