package com.my.springcloud.mapper;

import com.my.springcloud.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<User> userList();


}
