package com.aib.mapper;

import com.aib.entity.UserEntity;

import java.util.List;

public interface UserMapper {
    List<UserEntity> findUserByName(String phone);
}
