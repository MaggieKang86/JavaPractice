package com.bjpowernode.javaweb.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Date;

public class AServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 獲取系統當前時間
        Date nowTime = new Date();

        // 將系統當前時間綁定到請求域當中
        request.setAttribute("sysTime", nowTime);

        // 取出來
        // Object sysTime = request.getAttribute("sysTime");

        // 輸出到控制台
        // System.out.println(sysTime);

        // 這樣做可以嗎？
        // 在 AServlet 當中 new 一個 BServlet 對象，然後調用 BServlet 對象的 doGet 方法，把 request 對象傳過去
        // 這個代碼雖然可以實現功能，但是 Servlet 對象不能自己由程序員來 new，自己 new 的 Servlet 對象生命週期不受 Tomcat 服務器的管理。
        /*
        BServlet bServlet = new BServlet();
        bServlet.doGet(request, response);
        */

        // 使用 Servlet 當中的轉發機制
        // 執行了 AServlet 之後，跳轉到 BServlet （這個資源跳轉可以使用轉發機制來完成）
        // 怎麼轉發？代碼如何寫？
        // 第一步：獲取請求轉發器對象
        // 相當於把 " /b " 這個路徑包裝到請求轉發器當中，實際上是把下一個跳轉的資源路徑告知 Tomcat 服務器了
        // RequestDispatcher dispatcher = request.getRequestDispatcher("/b");

        // 第二步：調用請求轉發器 RequestDispatcher 的 forward 方法，進行轉發
        // 轉發的時候：這兩個參數很重要 request 和 response 都是樣傳遞給下一個資源的
        // dispatcher.forward(request, response);

        // 一行代碼搞定轉發
        // request.getRequestDispatcher("/b").forward(request, response);

        // 轉發到一個 Servlet，也可以轉發到一個 HTML，只要是 WEB 容器當中的合法資源即可
        request.getRequestDispatcher("/test.html").forward(request, response);


    }
}
