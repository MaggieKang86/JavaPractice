package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SelectMapperTest {

    /*
      MyBatis 的各種查詢功能：
      1.若查詢出的數據只有一條
        (1)可以通過實體類對象接收
        (2)可以通過 list 集合接收
        (3)可以通過 map 集合接收
           結果：{password=123456, sex=男, id=3, age=23, email=12345@qq.com, username=張三}
      2.若查詢出的數據有多條
        (1)可以通過實體類類型的 list 集合來接收
        (2)可以通過 map 類型的 list 集合來接收
        (3)可以在 mapper 接口的方法上添加 @MapKey 註解，此時就可以將每條數據轉換的 map 集合作為值，以某個字段的值作為鍵，放在同一個 map 集合中
        注意：一定不能通過實體類對象接收，此時會拋異常 TooManyResultException

        MyBatis 中設置了默認的類型別名
        java.lang.Integer --> int, integer
        int --> _int, _integer
        Map --> map
        String --> string
    */

    @Test
    public void testGetAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getAllUserToMap());
    }

    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserByIdToMap(3));
    }

    @Test
    public void testGetCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getCount());
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(3));
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getAllUser());
    }
}
