package com.bjpowernode.jdbc;

import com.bjpowernode.jdbc.model.ArticleDetailPO;
import com.bjpowernode.jdbc.model.ArticleMainPO;
import com.bjpowernode.jdbc.model.ArticlePO;
import jakarta.annotation.security.DeclareRoles;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sound.midi.Soundbank;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Lesson09JdbcTplApplicationTests {


    // 注入JdbcTemplate對象
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    void test01() {
        String sql = "select count(*) as ct from article";
        Long count = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println("記錄行數count = " + count);
    }

    // 查詢結果為單行紀錄， 使用 ？ 作為參數占位符
    @Test
    void test02() {
        String sql = "select * from article where id = ?";
        ArticlePO articlePO = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(ArticlePO.class), 1);
        System.out.println("articlePO = " + articlePO);
    }

    @Test
    void testRowMapper() {
        String sql = "select * from article where id = 1";
        ArticlePO articlePO = jdbcTemplate.queryForObject(sql, (rs, rowum) -> {
            System.out.println("rs = " + rs);
            //從rs獲取列值
            var id = rs.getInt("id");
            var userId = rs.getInt("user_id");
            var title = rs.getString("title");
            var summary = rs.getString("summary");
            var readCount = rs.getInt("read_count");
            var createTime = new Timestamp(rs.getTimestamp("create_time").getTime()).toLocalDateTime();
            var updateTime = new Timestamp(rs.getTimestamp("update_time").getTime()).toLocalDateTime();
            return new ArticlePO(id, userId, title, summary, readCount, createTime, updateTime);
        });
        System.out.println("po=" + articlePO.toString());
    }

    @Test
    void testList() {
        String sql = "select * from article order by id";
        // 一個list成員一行紀錄， map是列名和值
        List<Map<String, Object>> listMap = jdbcTemplate.queryForList(sql);
        listMap.forEach(el -> {
            el.forEach((field, value) -> {
                System.out.println("字段名稱：" + field + ", 列值：" + value);
            });
            System.out.println("===================");
        });
    }

    @Test
    void testUpate() {
        String sql = "update article set title = ? where id = ?";
        int row = jdbcTemplate.update(sql, "java編程實現", 2);
        System.out.println("更新行數 row = " + row);
    }

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Test
    void testNameParameter() {
        String sql = "select count(*) as ct from article where user_id = :uid and read_count > :num";
        // 給參數賦值
        Map<String, Object> param = new HashMap<>();
        param.put("uid", 2101);
        param.put("num", 10);

        Long readCounts = namedParameterJdbcTemplate.queryForObject(sql, param, Long.class);
        System.out.println("readCounts = " + readCounts);

    }

    @Test
    void testQueryContent() {
        String sql = """
                select m.*,d.id as detail_id, d.article_id,d.content
                from article m join article_detail d
                on m.id = d.article_id
                where m.id=:id
                """;
        Map<String, Object> param = new HashMap<>();
        param.put("id", 1);

        List<ArticleMainPO> mainList = namedParameterJdbcTemplate.query(sql, param, (rs, num) -> {
            var id = rs.getInt("id");
            var userId = rs.getInt("user_id");
            var title = rs.getString("title");
            var summary = rs.getString("summary");
            var readCount = rs.getInt("read_count");
            var createTime = new Timestamp(rs.getTimestamp("create_time").getTime()).toLocalDateTime();
            var updateTime = new Timestamp(rs.getTimestamp("update_time").getTime()).toLocalDateTime();

            // 文章內容
            var content = rs.getString("content");
            var detailId = rs.getInt("detail_id");
            var articleId = rs.getInt("article_id");

            ArticleDetailPO detail = new ArticleDetailPO();
            detail.setId(detailId);
            detail.setArticleId(articleId);
            detail.setContent(content);
            return new ArticleMainPO(id, userId, title, summary, readCount,
                    createTime, updateTime, detail);

        });

        mainList.forEach( m -> {
            Integer id = m.getId();
            System.out.println("id = " + id);
            System.out.println("m.getDetail() = " + m.getDetail());
        });

    }
}
