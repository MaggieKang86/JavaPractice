package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    // 查詢所有員工訊息
    List<Emp> getAllEmp();

    // 查詢員工及員工所對應的部門訊息
    Emp getEmpAndDept(@Param("eid") Integer eid);

    // 通過分步查詢查詢員工及員工所對應的部門訊息
    // 分步查詢第一步：查詢員工訊息
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    // 通過分步查詢部門以及部門中所有的員工訊息
    // 分步查詢第二步：根據did查詢員工訊息
    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);

}
