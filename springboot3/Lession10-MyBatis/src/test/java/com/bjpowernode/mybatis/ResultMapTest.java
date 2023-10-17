package com.bjpowernode.mybatis;

import com.bjpowernode.jdbc.model.ArticlePO;
import com.bjpowernode.mybatis.mapper.ArticleDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ResultMapTest {


    @Autowired
    private ArticleDao articleDao;
    @Test
    void test01(){
        ArticlePO articlePO = articleDao.selectById(1);
        System.out.println("依用戶id查找文章 = " + articlePO);
    }

    @Test
    void test02() {
        List<ArticlePO> list = articleDao.selectList(2101);
        list.forEach( po -> {
            System.out.println("po = " + po);
        });
    }

}
