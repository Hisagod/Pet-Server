package com.aib.service.impl;

import com.aib.dao.UserMapper;
import com.aib.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    UserMapper userMapper;

    @Override
    public void login() {

    }
}
