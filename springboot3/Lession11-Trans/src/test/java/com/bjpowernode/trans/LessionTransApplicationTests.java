package com.bjpowernode.trans;

import com.bjpowernode.trans.po.ArticlePO;
import com.bjpowernode.trans.service.ArticleService;
import com.bjpowernode.trans.service.impl.ArticleServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Random;

@SpringBootTest
class LessionTransApplicationTests {

    @Autowired
    private ArticleService articleService;
    @Test
    void testInsertArticleTrans() {

        ArticlePO articlePO = new ArticlePO();
        articlePO.setCreateTime(LocalDateTime.now());
        articlePO.setUpdateTime(LocalDateTime.now());
        articlePO.setTitle("Spring事務管理111");
        articlePO.setSummary("基於spring的註解管理事務，進行事務控制");
        articlePO.setUserId(new Random().nextInt(500));
        articlePO.setReadCount(0);

        String content = "111基於Spring的註解管理事務，進行事務控制。 1.聲明式 2.編程式";
        boolean add = articleService.postNewAritcle(articlePO, content);
        System.out.println("發布新文章 = " + add);

    }

}
