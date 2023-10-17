package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    // 通過分步查詢查詢員工及員工所對應的部門訊息
    // 分步查詢第二步：透過did查詢員工所對應的部門訊息
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    // 獲取部門以及部門中所有的員工訊息
    Dept getDeptandEmp(@Param("did") Integer did);

    // 通過分步查詢部門以及部門中所有的員工訊息
    // 分步查詢第一步：獲取部門訊息
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}
