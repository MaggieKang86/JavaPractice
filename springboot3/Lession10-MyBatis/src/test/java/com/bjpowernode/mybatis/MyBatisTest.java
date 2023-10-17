package com.bjpowernode.mybatis;

import com.bjpowernode.mybatis.mapper.ArticleMapper;
import com.bjpowernode.mybatis.po.ArticlePO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Random;

@SpringBootTest
class MyBatisTest {

    @Autowired
    private ArticleMapper articleMapper;
    @Test
    void testSelect() {
        ArticlePO articlePO = articleMapper.selectById(1);
        System.out.println("articlePO = " + articlePO);
    }

    @Test
    void testInsert() {
        ArticlePO articlePO = new ArticlePO();
        articlePO.setTitle("TomcatWeb開發");
        articlePO.setSummary("使用Tomcat服務器，定製web應用");
        articlePO.setReadCount(19);
        articlePO.setUserId(new Random().nextInt(500));
        articlePO.setCreateTime(LocalDateTime.now());
        articlePO.setUpdateTime(LocalDateTime.now());

        int rows = articleMapper.insertArticle(articlePO);
    }

    @Test
    void testUpdateReadCount() {
        int rows = articleMapper.updateReadCount(3, 29);
        System.out.println("更新筆數rows = " + rows);
    }

    @Test
    void testDelete() {
        int rows = articleMapper.deleteById(4);
        System.out.println("刪除筆數rows = " + rows);
    }
}
