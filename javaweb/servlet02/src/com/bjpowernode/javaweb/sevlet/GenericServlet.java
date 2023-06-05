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

    // 成員變量
    private ServletConfig config;

    /*
    init 方法中的 ServletConfig 對象是 Tomcat 創建的
    這個 ServletConfig 對象目前在 init 方法的參數上屬於區域變數
    那 ServletConfig 對象肯定以後會要在 service 方法中使用，不過要怎麼樣才能保證 ServletConfig 在 service 中可以被使用呢
     */
    @Override
    public final void init(ServletConfig servletConfig) throws ServletException {
        // System.out.println("servletConfig 對象，Tomcat 創建好的：" + config);
        this.config = config;

        // 調用 init() 方法
        this.init();
    }

    // 供子類 override 用的
    public void init() {

    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
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
