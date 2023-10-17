package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    /*
        SqlSession 默認不自動提交事務，若需要自動提交事務，
        可使用 SqlSessionFactory.openSession(true);
     */

    @Test
    public void testMyBatis() throws IOException {
        // 加載核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 獲取 SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 獲取 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 獲取 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 獲取 mapper 接口對象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 測試功能
        int result = mapper.insertUser();
        // 提交事務
        // sqlSession.commit();
        System.out.println("result:" + result);

    }

    @Test
    public void testCRUD() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // mapper.updateUser();
        // mapper.deletUser();
        /* User user = mapper.getUserById();
           System.out.println(user); */
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));

    }

}
