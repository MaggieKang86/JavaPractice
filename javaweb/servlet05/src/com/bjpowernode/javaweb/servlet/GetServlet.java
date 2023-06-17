package com.bjpowernode.javaweb.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        // 響應一些內容到瀏覽器上
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // out.println(); 是輸出訊息到瀏覽器，最終源代碼中換行。 （並非網頁上顯示的換行，若網頁上要換行需使用<br>）
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("     <head>");
        out.println("         <title>from get servlet</title>");
        out.println("     </head>");
        out.println("     <body>");
        out.println("         <h1>from get servlet</h1>");
        out.println("     </body>");
        out.println("</html>");

    }
}
