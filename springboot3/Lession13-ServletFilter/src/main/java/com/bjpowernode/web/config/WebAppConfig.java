package com.bjpowernode.web.config;

import com.bjpowernode.web.Serlvet.LoginServlet;
import com.bjpowernode.web.fliter.AuthFilter;
import com.bjpowernode.web.fliter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.RegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import java.util.logging.Filter;

@Configuration
public class WebAppConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        // 創建 ServletRegistrationBean 登錄一個或多個 Servlet：用來管理 Servlet 的對象
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        // 添加 Servlet
        servletRegistrationBean.setServlet( new LoginServlet());
        // 登記上方 servlet 的訪問路徑
        servletRegistrationBean.addUrlMappings("/user/login");
        // 指定此 servlet 創建的時間
        servletRegistrationBean.setLoadOnStartup(1);
        // 返回對象
        return servletRegistrationBean;
    }

//    @Bean
//    public FilterRegistrationBean filterRrgistraionBean(){
//        // 登記 Filter 對象
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new LogFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        return filterRegistrationBean;
//    }

    // 登錄 Filter，並指定執行順序
    @Bean
    public FilterRegistrationBean addLogFilter(){
        FilterRegistrationBean log = new FilterRegistrationBean();
        log.setFilter(new LogFilter());
        log.addUrlPatterns("/*");
        log.setOrder(1); // 設置順序，數字越大，執行順序越後面
        return log;
    }

    @Bean
    public FilterRegistrationBean addAuthFilter(){
        FilterRegistrationBean auth = new FilterRegistrationBean();
        auth.setFilter(new AuthFilter());
        auth.addUrlPatterns("/*");
        auth.setOrder(2);  // 設置順序，數字越大，執行順序越後面
        return auth;
    }

    // 登記框架內建的 Filter
    @Bean
    public FilterRegistrationBean addCommonLogFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        CommonsRequestLoggingFilter commonsRequestLoggingFilter = new CommonsRequestLoggingFilter();
        // 紀錄請求的 uri 地址
        commonsRequestLoggingFilter.setIncludeQueryString(true);
        filterRegistrationBean.setFilter(commonsRequestLoggingFilter);

        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

}
