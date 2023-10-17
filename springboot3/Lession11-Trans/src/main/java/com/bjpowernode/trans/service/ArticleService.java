package com.bjpowernode.trans.service;

import com.bjpowernode.trans.po.ArticlePO;

public interface ArticleService {

    // 發布新文章
    boolean postNewAritcle(ArticlePO article, String content);

}
