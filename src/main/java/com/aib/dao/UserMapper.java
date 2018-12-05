package com.aib.dao;

import com.aib.entity.UserEntity;

import java.util.List;

public interface UserMapper {
    UserEntity findUserByPhone(String phone);
}
