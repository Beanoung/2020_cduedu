package com.example.cduedu_user.mapper;

import com.example.cduedu_user.entity.User;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserMapper {
    User getUserInfo(String UsersPhone);    //根据UsersPhone查询用户信息
    int save (User user);                   //新增用户
    int update (User user);                 //更新用户信息
    int deleteById (String UsersPhone);     //根据UsersPhone删除
    List<User> selectAll ();                //查询所有用户信息
}
