package com.lqw.mybatis.service;

import com.lqw.mybatis.dao.mapper.UserMapper;
import com.lqw.mybatis.dao.two.User2Mapper;
import com.lqw.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired(required = false)
    private User2Mapper user2Mapper;

    public List<User> select() {
        return userMapper.selectAll();
    }

    public List<User> select2() {
        return user2Mapper.selectAll();
    }
}
