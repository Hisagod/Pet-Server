package com.aib.dao;

import com.aib.entity.RegisterEntity;

import java.util.List;

public interface UserMapper {
    /**
     * 用户注册
     * @param entity
     */
    void registerUser(RegisterEntity entity);

    List<RegisterEntity> findUserByPhone();
}
