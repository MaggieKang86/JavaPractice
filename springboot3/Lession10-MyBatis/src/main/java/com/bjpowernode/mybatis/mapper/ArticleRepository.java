package com.bjpowernode.mybatis.mapper;

import com.bjpowernode.mybatis.po.ArticlePO;
import com.bjpowernode.mybatis.provider.SqlProvider;
import org.apache.ibatis.annotations.*;

import java.time.LocalDateTime;

public interface ArticleRepository {

    // 定義 @Result
    @Select("")
    @Results(id = "NewBaseArticleMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "user_id", property = "userId"),
            @Result(column = "title", property = "title"),
            @Result(column = "summary", property = "summary"),
            @Result(column = "read_count", property = "readCount"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime")
    })
    ArticlePO articleMapper();

    // 使用提供者
    @ResultMap("NewBaseArticleMap")
    @SelectProvider(type = SqlProvider.class, method = "selectArticle")
    ArticlePO selectBuPrimary(Integer id);

    @UpdateProvider(type = SqlProvider.class, method = "updateSql")
    int updateTime(Integer id, LocalDateTime newTime);

    @InsertProvider(type = SqlProvider.class, method = "insertSql")
    int insertArticle(ArticlePO po);

    @DeleteProvider(type = SqlProvider.class, method = "deleteSql")
    int deleteById(Integer id);

}
