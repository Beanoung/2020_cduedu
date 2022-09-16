package com.example.cduedu_user.controller;

import com.example.cduedu_user.entity.User;
import com.example.cduedu_user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //通过用户UsersPhone获取用户所有信息
    @RequestMapping(value = "getUser/{UsersPhone}", method = RequestMethod.GET)
    public String GetUser(@PathVariable String UsersPhone) {
        return userService.getUserInfo(UsersPhone).toString();
    }

    //通过用户UsersPhone删除用户
    @RequestMapping(value = "/api/delete", method = RequestMethod.GET)
    public String delete(String UsersPhone) {
        int result = userService.deleteById(UsersPhone);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    //根据用户UsersPhone更新用户信息
    @RequestMapping(value = "/api/update", method = RequestMethod.POST)
    public String update(User user) {

        int result = userService.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    //插入新用户
    @RequestMapping(value = "/api/insert", method = RequestMethod.POST)
    public User insert(User user) {
        return userService.save(user);
    }

    //打印所有用户信息
    @RequestMapping("/api/selectAll")
    @ResponseBody
    public List<User> ListUser() {
        return userService.selectAll();
    }

}
