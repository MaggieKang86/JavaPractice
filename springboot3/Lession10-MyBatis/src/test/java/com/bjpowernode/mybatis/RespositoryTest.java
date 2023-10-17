package com.bjpowernode.mybatis;

import com.bjpowernode.mybatis.mapper.ArticleRepository;
import com.bjpowernode.mybatis.po.ArticlePO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class RespositoryTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    void test01(){
        ArticlePO po = articleRepository.selectBuPrimary(3);
        System.out.println("po = " + po);
    }

    @Test
    void test02() {
        int i = articleRepository.updateTime(2, LocalDateTime.now());
        System.out.println("i = " + i);
    }

    @Test
    void test03() {
        ArticlePO po = new ArticlePO();
        po.setTitle("Spring6");
        po.setSummary("Spring6全新課程");
        po.setUserId(29);
        po.setReadCount(0);
        po.setCreateTime(LocalDateTime.now());
        po.setUpdateTime(LocalDateTime.now());
        articleRepository.insertArticle(po);
    }

    @Test
    void test04() {
        articleRepository.deleteById(3);
    }
}
