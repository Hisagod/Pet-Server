package com.aib.service.impl;

import com.aib.dao.UserMapper;
import com.aib.entity.UserEntity;
import com.aib.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 标记是一个Service
 */
@Service
public class LoginServiceImpl implements LoginService {
    //注入
    @Resource
    UserMapper userMapper;

    @Override
    public List<UserEntity> login() {
       return userMapper.findUserByPhone();
    }
}
