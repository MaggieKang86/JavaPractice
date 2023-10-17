package com.bjpowernode.mvc.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class AuthInterceptor implements HandlerInterceptor {

    private static final String COMMON_USER = "zhangsan";

    // 判斷登入的用戶是否可以執行相應的動作
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("====AuthInterceptor權限攔截器====");
        // 獲取登入的用戶
        String loginUser = request.getParameter("loginUser");
        // 獲取請求的 uri 地址
        String requestURI = request.getRequestURI();

        // 判斷用戶和操作
        if (COMMON_USER.equals(loginUser) && (
           requestURI.startsWith("/article/add") ||
           requestURI.startsWith("/article/edit") ||
           requestURI.startsWith("/article/remove")
        )) {
            return false;
        }
        return true;
    }
}
