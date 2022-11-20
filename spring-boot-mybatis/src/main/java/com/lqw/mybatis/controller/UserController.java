package com.lqw.mybatis.controller;


import com.alibaba.druid.pool.DruidDataSource;
import com.lqw.mybatis.domain.User;
import com.lqw.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public List<User> select() {
        return userService.select();
    }

    @GetMapping("/select2")
    public List<User> select2() {
        return userService.select2();
    }
}
