package com.bjpowernode.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/*
    核心註解功能
    @SpringBootConfiguration：包含@Configuration註解的功能
        @Configuration：JavaConfig的功能，配置類，結合@Bean能夠將對象注入到spring的IOC容器
        有@SpringBootConfiguration標注的類是配置類，Lession06PackageApplication是配置類

    @EnableAutoConfiguration：開啟自動配置，將spring和第三方庫中的對象創建好，注入到spring容器
                              避免寫xml，去掉樣例代碼。需要使用的對象，由框架提供

    @ComponentScan：組建掃描器，<context:component-scan base-package="xxx包"/>
        掃描@Controller, @Service, @Repository, @Component註解，創建他們的對象注入到容器
        springboot的約定：啟動類，作為掃描包的根（起點），@Component掃描com.bjpowernode.pk
        和他的子包中所有的類

 */

@SpringBootApplication
public class Lession06PackageApplication {

    // Lession06PackageApplication是配置類，故可在其中聲明對象
    @Bean
    public Date myDate(){
        return new Date();
    }

    public static void main(String[] args) {
        // run方法的第一個參數是 源（配置類），從這裡加載Bean，找到Bean注入到spring的容器
        // run方法返回值是容器對象
        ApplicationContext ctx = SpringApplication.run(Lession06PackageApplication.class, args);

        // 可以從容器獲取對象
        Date bean = ctx.getBean(Date.class);
    }

}
