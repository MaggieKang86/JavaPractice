package com.bjpowernode.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
public class HelloController {

    @Autowired
    private Date date;

    @GetMapping("/hello")
    public String hello(){
        return "＝＝＝＝歡迎使用 springboot3＝＝＝＝" + date;
    }

}
