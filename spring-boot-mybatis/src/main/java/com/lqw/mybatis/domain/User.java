package com.lqw.mybatis.domain;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String noCard;
}
