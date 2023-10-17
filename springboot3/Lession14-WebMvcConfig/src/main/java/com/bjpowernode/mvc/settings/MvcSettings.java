package com.bjpowernode.mvc.settings;

import com.bjpowernode.mvc.fomatter.DeviceFormatter;
import com.bjpowernode.mvc.interceptor.AuthInterceptor;
import com.bjpowernode.mvc.interceptor.LoginIntercpetor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
    SpringMVC 配置：使用 JavaConfig 的方式配置 SpringMVC，代替原來的 xml 配置文件
*/

@Configuration
public class MvcSettings implements WebMvcConfigurer {

    // 頁面跳轉控制器，從請求直達視圖頁面（無需 Controller）
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 配置頁面控制：addViewController("請求uri的地址").指定他的視圖setViewName("index")
        registry.addViewController("/welcome").setViewName("index");
    }

    // 轉換器
    @Override
    public void addFormatters(FormatterRegistry registry){
        registry.addFormatter(new DeviceFormatter());
    }

    // 攔截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 權限攔截器
        AuthInterceptor authInterceptor = new AuthInterceptor();
        registry.addInterceptor(authInterceptor)
                .order(2) // 順序，整數值，越小先執行
                .addPathPatterns("/article/**") // 攔截以 article 開頭的所以請求
                .excludePathPatterns("/article/query"); // 不攔截的地址

        // 登入攔截器
        LoginIntercpetor loginIntercpetor = new LoginIntercpetor();
        registry.addInterceptor(loginIntercpetor)
                .order(1) // 順序，整數值，越小先執行
                .addPathPatterns("/**")  // 攔截所有對 controller 的請求
                .excludePathPatterns("/article/query");  // 排除

    }

}
