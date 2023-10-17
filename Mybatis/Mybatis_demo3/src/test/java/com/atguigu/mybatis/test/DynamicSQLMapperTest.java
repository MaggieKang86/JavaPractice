package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicSQLMapperTest {

    /*
        動態SQL:
        1.if:根據標籤中 test 屬性所對應的表達式決定標籤中的內容是否需要拼接到 SQL 中
        2.where:
          當 where 標籤中「有」內容時，會自動生成 where 關鍵字，並將內容「前」多餘的 and 或 or 去掉
          當 where 標籤中「沒有」內容時，此時 where 關鍵字沒有任何效果
          注意: where 標籤不能將其中內容後面多餘的 and 或 or 去掉
        3.trim
          若標籤中有內容時:
          prefix / suffix:將 trim 標籤中內容前或後面「添加」指定內容
          prefixOverrides / suffixOverrides:將 trim 標籤中內容前或後面「去掉」指定內容
          若標籤中沒有內容時，trim 標籤也沒有任何效果
        4.choose、when、otherwise 相當於 if...else if...else
          when 至少要有一個，otherwise最多只能一個
        5.foreach
          collection:設置需要循環的數組或集合
          item:表示數組或集合中的每一個數據
          separator:循環體之間的分割符號
          open:標示循環體的所有內容的開始符號
          close:標示循環體的所有內容的結束符號
        6.sql標籤
          設置 SQL 片段<sql id="empColumns">eid,emp_name, age, sex, email</sql>
          引用 SQL 片段<include refid="empColumns"></include>
     */

    @Test
    public void testInsertMoreByList(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "a1", 23, "男", "ggininder@gmail.com");
        Emp emp2 = new Emp(null, "a2", 25, "男", "ggininder@gmail.com");
        Emp emp3 = new Emp(null, "a3", 27, "男", "ggininder@gmail.com");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        System.out.println(mapper.insertMoreByList(emps));
    }

    @Test
    public void testDeleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int result = mapper.deleteMoreByArray(new Integer[]{2, 3});
        System.out.println(result);
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByChoose(new Emp(null, "無名氏", 26, "女", "baei@gmail.com"));
        System.out.println(list);
    }

    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByCondition(new Emp(null, "無名氏", 26, "女", "baei@gmail.com"));
        System.out.println(list);
    }
}
