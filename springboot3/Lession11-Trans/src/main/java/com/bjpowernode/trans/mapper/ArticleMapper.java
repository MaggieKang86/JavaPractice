package com.bjpowernode.trans.mapper;

import com.bjpowernode.trans.po.ArticleDetailPO;
import com.bjpowernode.trans.po.ArticlePO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface ArticleMapper {

    // 添加新的文章  Article表
    @Insert("""
            insert into article(user_id, title, summary, read_count, create_time, update_time)
            value(#{userId}, #{title}, #{summary}, #{readCount}, #{createTime}, #{updateTime})
            """)
    // 可選的配置，可獲得自動增長的主鍵值
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")   // 取得自動新增的id號
    int insertArticle(ArticlePO articlePO);

    // 添加文章內容  Article_Detail表
    @Insert("""
            insert into article_detail(article_id, content) values (#{articleId}, #{content}) 
            """)
    int insertDeatil(ArticleDetailPO articleDetailPO);

}
