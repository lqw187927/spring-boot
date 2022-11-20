package com.lqw.mybatis.dao.mapper;


import com.lqw.mybatis.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
}
