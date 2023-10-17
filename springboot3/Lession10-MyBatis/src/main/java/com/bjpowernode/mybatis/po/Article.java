package com.bjpowernode.mybatis.po;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Article {

    private Integer id;
    private Integer userId;
    private String title;
    private String summary;
    private Integer readCount;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    // 一對一關係
    private ArticleDetail articleDetail;

}
