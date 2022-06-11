package com.my.springcloud.controller;

import com.my.springcloud.pojo.User;
import com.my.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public List<User> userList(){
        return userService.userList();
    }

}
