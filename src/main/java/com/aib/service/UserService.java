package com.aib.service;


import com.aib.entity.RegisterEntity;

import java.util.List;

public interface UserService {
    List<RegisterEntity> login();

    void register(RegisterEntity entity);
}
