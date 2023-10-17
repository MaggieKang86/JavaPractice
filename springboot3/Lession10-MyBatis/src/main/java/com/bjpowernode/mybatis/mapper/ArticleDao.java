package com.bjpowernode.mybatis.mapper;

import com.bjpowernode.jdbc.model.ArticlePO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleDao {

    // 查詢方法1，使用主鍵id，查詢某用戶的所有文章
    @Select("""
            select id, user_id, title, summary, read_count, create_time, update_time
            from article
            where user_id = #{userId}
            """)
    @Results(id = "BaseArticleMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "user_id", property = "userId"),
            @Result(column = "title", property = "title"),
            @Result(column = "summary", property = "summary"),
            @Result(column = "read_count", property = "readCount"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime")
    })
    List<ArticlePO> selectList(Integer userId);

    // 查詢方法2，使用主鍵id，查詢某個文章
    @Select("""
            select id, user_id, title, summary, read_count, create_time, update_time
            from article
            where id = #{id}
            """)
    // 引用定義好的結果映射，value的值是@Results中的id
    // @ResultMap("BaseArticleMap")
    // 使用 xml 中的<resultMap>的id
    @ResultMap("ArticleBaseMapper")
    ArticlePO selectById(Integer id);


}
