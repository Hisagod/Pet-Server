package com.aib.service;


import com.aib.entity.RegisterEntity;

import java.util.List;

public interface UserService {
    /**
     * 查询是否有这个用户
     *
     * @return
     */
    RegisterEntity findUser(String phone);

    List<RegisterEntity> login();

    void register(RegisterEntity entity);
}
