package com.bjpowernode.javaweb.servlet;

import javax.servlet.http.HttpServlet;

public class HelloServlet extends HttpServlet {
    // 通過無參數構造方法創建對象
    /*
    public HelloServlet(){
    }
    */

    // 沒有提供 init 方法，那麼必然執行父類 HttpServlet 的 init 方法
    // HttpServlet 類中沒有 init 方法，會繼續執行 GenericServlet 類中的 init 方法

    // 沒有提供 service 方法。 那麼必然執行父類 HttpServlet 類 service 方法

}
