package com.bjpowernode.mybatis.mapper;

import com.bjpowernode.mybatis.po.ArticlePO;
import org.apache.ibatis.annotations.*;

public interface ArticleMapper {


    // 依主鍵查詢
    // 查詢的註解 Select
    @Select("""  
            select id, user_id, title, summary, read_count, create_time, update_time
            from article where id = #{articleId}
            """)
    // 查詢結果 ResultSet 和 PO對象的屬性映射
    @Results(id = "BaseArticleMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "user_id", property = "userId"),
            @Result(column = "title", property = "title"),
            @Result(column = "summary", property = "summary"),
            @Result(column = "read_count", property = "readCount"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime")
    })
    ArticlePO selectById(@Param("articleId") Integer id);

    // ===============================================

    // insert
    @Insert("""
            insert into article(user_id, title, summary, read_count, create_time, update_time)
            value(#{userId}, #{title}, #{summary}, #{readCount}, #{createTime}, #{updateTime})
            """)
    // 插入紀錄的行數
    int insertArticle(ArticlePO po);

    // ===============================================

    // update  使用參數名可作為占位符 #{形參名}
    @Update("""
            update article set read_count =#{readCount} where id = #{id}
            """)
    // 依id更新閱讀數量
    int updateReadCount(Integer id, Integer readCount);

    // ===============================================

    // Delete
    @Delete("""
            delete from article where id = #{id}
            """)
    int deleteById(Integer id);
}
