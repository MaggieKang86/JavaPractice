package com.bjpowernode.javaweb.servlet.ConfigTestServlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ConfigTestServlet2 extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 獲取 ServletConfig 對象
        ServletConfig config = this.getServletConfig();

        // 輸出
        // org.apache.catalina.core.StandardWrapperFacade@6025cd6
        out.print("ServletConfig 對象: " + config);

        String value = config.getInitParameter("key");
        out.print("<br>" + value);


    }
}
