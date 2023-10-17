package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ResultMapTest {

    /*
        解決字段名和屬性名不一致的情況：
        1.為字段起別名，保持和屬性名一致
        2.設置全局配置，將_自動應設為駝峰
          <setting name="mapUnderscoreToCamelCase" value="true"/>
        3.通過 resultMap 設定自定義的映射關係
          <resultMap id="empResultMap" type="">
             <id property="eid" column="eid"></id>
             <result property="empName" column="emp_name"></result>
             <result property="age" column="age"></result>
             <result property="sex" column="sex"></result>
             <result property="email" column="email"></result>
          </resultMap>

        處理多對一的映射關係：
        1.級聯屬性賦值
        2.association
        3.分步查詢

        處理一對多的映射關係：
        1.collection
        2.分步查詢
    */

    @Test
    public void testGetDeptAndEmpByStep(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(dept.getDeptName());
    }

    @Test
    public void testGetDeptAndEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptandEmp(1);
        System.out.println(dept);
    }

    @Test
    public void testGetEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(3);
        System.out.println(emp.getEmpName());
        System.out.println("+++++++++++++++++++++++");
        System.out.println(emp.getDept());
    }

    @Test
    public void testGetEmpAndDept(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(1);
        System.out.println(emp);
    }

    @Test
    public void testGetAllEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> list = mapper.getAllEmp();
        list.forEach(emp -> System.out.println(emp));
    }
}
