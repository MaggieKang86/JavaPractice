package com.bjpowernode.problem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProblemConrtoller {

    @GetMapping("/probs/not-found")
    public String doNotFound() {
        return "圖書的 isbn 可能不存在";
    }
}
