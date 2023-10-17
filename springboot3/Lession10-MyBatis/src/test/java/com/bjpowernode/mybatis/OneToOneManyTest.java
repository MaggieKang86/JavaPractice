package com.bjpowernode.mybatis;

import com.bjpowernode.mybatis.mapper.ArticleCommentMapper;
import com.bjpowernode.mybatis.mapper.ArticleOneToOneMapper;
import com.bjpowernode.mybatis.po.ArticlceEntity;
import com.bjpowernode.mybatis.po.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OneToOneManyTest {

    @Autowired
    private ArticleOneToOneMapper articleOneToOneMapper;

    @Autowired
    private ArticleCommentMapper articleCommentMapper;

    @Test
    void testOneToOne(){
        Article article = articleOneToOneMapper.selectAllArticle(1);
        System.out.println("article = " + article);
    }

    @Test
    void testOneToMany() {
        ArticlceEntity articlceEntity = articleCommentMapper.selectArticleComment(1);
        System.out.println("articlceEntity = " + articlceEntity);
    }
}
