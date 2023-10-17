package com.bjpowernode.mvc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @PostMapping("/article/add")
    public String addArticle() {
        return "發布新的文章";
    }

    @PostMapping("/article/edit")
    public String editArticle(){
        return "修改文章";
    }

    @DeleteMapping("/article/remove")
    public String remove(){
        return "刪除文章";
    }

    @PostMapping("/article/query")
    public String query(){
        return "查詢文章";
    }

}
