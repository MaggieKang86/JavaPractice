package com.bjpowernode.mybatis.po;

import java.time.LocalDateTime;
import java.util.List;

public class ArticlceEntity {

    private Integer id;
    private Integer userId;
    private String title;
    private String summary;
    private Integer readCount;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    // 多個評論
    private List<CommentPO> comments;

}
