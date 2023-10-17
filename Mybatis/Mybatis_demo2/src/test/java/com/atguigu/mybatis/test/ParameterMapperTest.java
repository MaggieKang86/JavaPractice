package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.ParameterMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParameterMapperTest {

    /*
        Mybatis 獲取參數的兩種方式:${}和#{}
            ${}:本質字符串拼接
            #{}:本質占位符賦值

        Mybatis 獲取參數值的各種情況
        1.mapper 接口方法的參數為單個字面量類型
          可以通過${}和#{}以任意的名稱獲取參數值，但需要注意${}的單引號問題
        2.mapper 接口方法的參數為多個時
          此時 mybatis 會將這些參數放置在一個 map 集合中，以兩種方式進行存儲
          (1)以arg0, arg1...為鍵，以參數為值
          (2)以param1, param2...為鍵，以參數為值
          因此只需要通過#{}和${}以鍵的方式訪問值即可，但需要注意${}的單引號問題
        3.若 mapper 接口方法中有多個參數時，可以手動將這些參數放至一個 map 中存儲
          只需要通過#{}和${}以鍵的方式訪問值即可，但需要注意${}的單引號問題
        4.mapper 接口方法的參數是實體類類型的參數
          只需要通過#{}和${}以屬性的方式訪問屬性值即可，但需要注意${}的單引號問題
        5.使用 @Param 註解命名參數
          此時 mybatis 會將這些參數放置在一個 map 集合中，以兩種方式進行存儲
          (1)以@Param註解的值為鍵，以參數為值
          (2)以param1, param2...為鍵，以參數為值
          因此只需要通過#{}和${}以鍵的方式訪問值即可，但需要注意${}的單引號問題
    */

    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.CheckLoginByParam("admin", "123456");
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int result = mapper.insertUser(new User(null, "李四", "11233", 25, "男", "xiaoboa@mail.com"));
        System.out.println(result);
    }

    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "123456");
        User user = mapper.CheckLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.CheckLogin("admin", "123456");
        System.out.println(user);
    }

    @Test
    public void testGetUserByUserame(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("admin");
        System.out.println(user);
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }

    @Test
    public void testJDBC() throws Exception {
        String name = "admin";
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        // PreparedStatement ps = connection.prepareStatement("select * from t_user where username = '" + username + "'");
        PreparedStatement ps = connection.prepareStatement("select * from t_user where username = ?");
        ps.setString(1, "username");
    }

}
