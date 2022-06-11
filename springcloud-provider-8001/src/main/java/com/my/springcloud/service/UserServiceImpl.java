package com.my.springcloud.service;

import com.my.springcloud.mapper.UserMapper;
import com.my.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList() {
        return userMapper.userList();
    }
}
