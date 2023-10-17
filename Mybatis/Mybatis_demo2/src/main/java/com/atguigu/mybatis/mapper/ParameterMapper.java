package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    // 驗證登入(使用 @Param)
    User CheckLoginByParam(@Param("username") String username, @Param("password") String password);

    // 添加用戶訊息
    int insertUser(User user);

    // 驗證登入(參數為map)
    User CheckLoginByMap(Map<String, Object> map);

    // 驗證登入
    User CheckLogin(String username, String password);

    // 查詢員工訊息
    User getUserByUsername(String username);

    // 查詢所有員工訊息
    List<User> getAllUser();
}
