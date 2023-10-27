package com.bjpowernode.httpservice.config;


import com.bjpowernode.httpservice.service.TodoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration(proxyBeanMethods = false)
public class HttpConfiguration {

    // 創建服務接口的代理對象，基於 WebClient
    @Bean
    public TodoService requestService() {
        WebClient webClient = WebClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();

        // 創建代理工廠
        HttpServiceProxyFactory proxyFactory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(webClient)).build();
        // 創建某個接口的代理服務
        return proxyFactory.createClient(TodoService.class);
    }

}
