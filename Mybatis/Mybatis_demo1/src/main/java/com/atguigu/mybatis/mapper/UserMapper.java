package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    /*
        Mybatis 面向接口編程的兩個一致：
        1.映射文件的 namespace 要和 mapper 接口的全類名保持一致
        2.映射文件中 SQL 語句的 id 要和 mapper 接口中的方法名一致

        表--實體類--mapper接口--映射文件
     */

    // 添加用戶訊息
    int insertUser();

    // 修改訊息
    void updateUser();

    // 刪除訊息
    void deletUser();

    // 根據 id 查詢用戶訊息
    User getUserById();

    // 查詢所有的用戶訊息
    List<User> getAllUser();

}
