package com.bjpowernode.config;

import com.bjpowernode.config.pk10.Person;
import com.bjpowernode.config.pk6.NestAppBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;


// 在配置類加入註解@ImportResource
@ImportResource(locations = { "classpath:/applicationContext.xml" })

// 啟用ConfigurationProperties  屬性是類名字
//@EnableConfigurationProperties({NestAppBean.class})
// 掃描註解的包名，其中綁定 Bean 注入到 spring 容器
@ConfigurationPropertiesScan(basePackages = { "com.bjpowernode.config.pk6", "com.bjpowernode.config.pk8" })
@SpringBootApplication
public class Lession07ConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Lession07ConfigApplication.class, args);

        Person bean = run.getBean(Person.class);
        System.out.println("bean = " + bean);
    }

}
