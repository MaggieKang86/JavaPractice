package com.bjpowernode.javaweb.sevlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class LoginService extends GenericServlet{

    // Q:是否有需要在 LoginServlet class 中覆寫 init 方法？
    // A:有可能的，所以覆寫 init method
    /*
    public void init(ServletConfig config) throws ServletException {
        System.out.println("我重寫了自己的規則...");
    }
    */

    // 父類將原始的 init 方法 final，使子類無法 override
    // 但此時我仍希望 override，怎辦
    @Override
    public void init() {
        System.out.println("LoginServlet's init() method execute!");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("正在處理用戶請求，請稍候...");
        // 如果想在 LoginServlet 子類中使用 ServletConfig 怎麼辦？
        // 因為繼承了 GenericServlet，所以可使用其中的 getServletConfig 方法
        ServletConfig config = this.getServletConfig();
        System.out.println("service 方法中是否可以使用 ServletConfig 對象？：" + config);

    }

}
