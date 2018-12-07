package com.aib.dao;

import com.aib.entity.RegisterEntity;

public interface UserMapper {
    /**
     * 用户注册
     * @param entity
     */
    void registerUser(RegisterEntity entity);

    RegisterEntity findUserByPhone(String phone);
}
