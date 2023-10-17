package com.bjpowernode.web.fliter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.catalina.connector.Response;
import org.apache.coyote.Request;

import java.io.IOException;

// @WebFilter(urlPatterns = "/*")
public class LogFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 紀錄請求路徑
        String uri = ((HttpServletRequest) servletRequest).getRequestURI().toString();
        System.out.println("＝＝ LogFilter 過濾器執行了，uri：" + uri);
        filterChain.doFilter(servletRequest, servletResponse);
    }

}
