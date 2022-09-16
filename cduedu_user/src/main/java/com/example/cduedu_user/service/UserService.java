package com.example.cduedu_user.service;

import com.example.cduedu_user.entity.User;
import com.example.cduedu_user.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserInfo(String UsersPhone){
        return userMapper.getUserInfo(UsersPhone);
    }

    public User save(User user) {
        userMapper.save(user);
        return user;
    }

    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    public int Update(User user){
        return userMapper.update(user);
    }

    public int deleteById(String UsersPhone){
        return userMapper.deleteById(UsersPhone);
    }
}
