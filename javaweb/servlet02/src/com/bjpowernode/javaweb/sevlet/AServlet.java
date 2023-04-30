package com.bjpowernode.javaweb.sevlet;

import javax.servlet.*;
import java.io.IOException;

public class AServlet implements Servlet {

    // 無參數構造方法
    public AServlet() {
        System.out.println("AServlet無參數構造方法執行了");
    }

    // init 被翻譯為「初始化」
    // init 只會被執行一次
    // 在 AServlet 對象第一次被創建後執行
    // init 通常是完成初始化操作的
    // init 被執行時，AServlet 已經被建立出來了
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("AServlet's init method execute!");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    // service 方法：是處理用戶請求的核心方法
    // 只要用戶發送一次請求，service 必然會執行一次
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("AServlet's service method execute!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    // destroy 也是只執行一次
    // Tomcat 在清除 AServlet 之前會調用一次 destroy 方法
    // destroy 方法在執行時，AServlet 的內存尚未被清除，即將被清除
    // destroy 可以編寫清除前的準備，比如：Tomcat 關閉前，AServlet 開啟了一些資源 (流或資料庫連接)，那 Tomcat 要關閉這些資源的程式碼就可以寫到 destroy 裡
    @Override
    public void destroy() {
        System.out.println("AServlet's destroy method execute!");
    }

}
