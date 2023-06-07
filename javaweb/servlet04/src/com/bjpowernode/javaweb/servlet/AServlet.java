package com.bjpowernode.javaweb.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class AServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // 獲取 ServletContext 對象
        ServletContext application = this.getServletContext();
        out.print("ServletContext對象是: " + application + "<br>");

        // 獲取上下文的初始化參數
        Enumeration<String> initParameterNames = application.getInitParameterNames();  // 返回初始化參數的名字
        while(initParameterNames.hasMoreElements()){
            String name = initParameterNames.nextElement();
            String value = application.getInitParameter(name);
            out.print(name + "=" + value + "<br>");
        }

        // 獲取 context path (動態獲取應用上下文的源頭)
        String contextPath = application.getContextPath();
        out.print(contextPath + "<br>");

        // 動態取得文件的絕對路徑
        String realPath = application.getRealPath("/index.html"); // () 中的 "/" 可寫可不寫
        out.print(realPath + "<br>");

        String realPath1 = application.getRealPath("/common/common.html");
        out.print(realPath + "<br>");

        // 準備數據
        User user = new User("jack", "123");
        // 向 ServletContext 應用域當中儲存數據
        application.setAttribute("userObj", user);
        // 在 AServlet 取出
        // Object userObj = application.getAttribute("userObj");
        // 輸出到瀏覽器
        // out.print(userObj + "<br>");

    }
}
