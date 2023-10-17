package com.bjpowernode.mybatis.provider;

public class SqlProvider {

    // 定義靜態方法
    public static String selectArticle(){
        return "select * from article where id = #{id}";
    }

    public static String updateSql(){
        return "update article set update_time = #{newTime} where id = #{id}";
    }

    public static String insertSql(){
        return """
                insert into article(user_id, title, summary, read_count, create_time, update_time)
                value(#{userId}, #{title}, #{summary}, #{readCount}, #{createTime}, #{updateTime})
                """;
    }

    public static String deleteSql(){
        return """
               delete from article where id = #{articleId}
               """;
    }

}
