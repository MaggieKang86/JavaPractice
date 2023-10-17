package com.bjpowernode.mvc.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginIntercpetor implements HandlerInterceptor {

    private List<String> permitUser = new ArrayList<>();

    public LoginIntercpetor() {
        this.permitUser = Arrays.asList("zhabgsan", "lisi", "admin");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("====LoginInterceptor登入攔截器執行了====");

        // 獲取登入的用戶名
        String loginUser = request.getParameter("loginUser");

        // 只有三個用戶可以訪問系統
        if (StringUtils.hasText(loginUser) && permitUser.contains(loginUser)) {
            return true;
        }
        return false;
    }

}
