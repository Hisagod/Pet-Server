package com.aib.service.impl;

import com.aib.dao.UserMapper;
import com.aib.entity.RegisterEntity;
import com.aib.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 标记是一个Service
 */
@Service
public class UserServiceImpl implements UserService {
    //注入
    @Resource
    UserMapper userMapper;

    @Override
    public void register(RegisterEntity entity) {
        userMapper.registerUser(entity);
    }

    @Override
    public RegisterEntity findUser(String phone) {
        RegisterEntity entity = userMapper.findUserByPhone(phone);
        return entity;
    }

    @Override
    public List<RegisterEntity> login() {
        return null;
    }

}
