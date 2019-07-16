package org.yabo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yabo.dao.UserMapper;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void insert() {

    }
}
