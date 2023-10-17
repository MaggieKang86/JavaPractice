package com.bjpowernode.trans.service.impl;

import com.bjpowernode.trans.mapper.ArticleMapper;
import com.bjpowernode.trans.po.ArticleDetailPO;
import com.bjpowernode.trans.po.ArticlePO;
import com.bjpowernode.trans.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class ArticleServiceImpl implements ArticleService {

    // 注入mapper
    @Autowired
    private ArticleMapper articleMapper;


    /* @Transactional: 事務控制註解
            位置: 1. 方法的上面   2. 類的上面

            事務回滾：
             1.默認對運行時異常，執行回滾 rollback
             2.rollbackFor: 需要回滾時的異常類列表
     */
    @Transactional
    @Override
    public boolean postNewAritcle(ArticlePO article, String content) {

        // 添加新文章
        int rows = articleMapper.insertArticle(article);

        // 拋出異常
        if(article.getReadCount() < 1) {
            throw new RuntimeException("文章閱讀數量最小 = 1");
        }

        // 添加文章內容
        ArticleDetailPO articleDetailPO = new ArticleDetailPO();
        articleDetailPO.setArticleId(article.getId());
        articleDetailPO.setContent(content);
        int detailRows = articleMapper.insertDeatil(articleDetailPO);

        return (rows + detailRows) == 2 ? true : false;

    }
}
