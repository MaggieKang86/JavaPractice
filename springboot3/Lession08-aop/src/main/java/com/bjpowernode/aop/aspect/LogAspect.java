package com.bjpowernode.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

@Component
@Aspect
public class LogAspect {

    // 功能增強的方法
    @Before("execution(* com.bjpowernode.aop.service..*.*(..))")
    public void sysLog(JoinPoint jp){
        StringJoiner log = new StringJoiner("|", "{", "}");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("yyyy-MM-dd HH:mm:ss"));
        log.add(formatter.format(LocalDateTime.now()));

        // 當前執行的業務方法名稱
        String methodName = jp.getSignature().getName();
        log.add(methodName);

        // 方法的參數
        Object[] args = jp.getArgs();
        for(Object arg:args){
            log.add(arg == null ? "-" : arg.toString() );
        }

        System.out.println("日誌：" + log);

    }

}
