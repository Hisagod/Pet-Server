package com.aib.controller;

import com.aib.entity.BaseEntity;
import com.aib.entity.UserEntity;
import com.aib.service.impl.LoginServiceImpl;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LoginController {
    @Resource
    LoginServiceImpl loginService;

    @RequestMapping("/index")
    public String findAllUser(Model model) {
        List<UserEntity> userEntities = loginService.login();
        BaseEntity<List<UserEntity>> baseEntity = new BaseEntity<>(200, "成功", userEntities);
        String json = new Gson().toJson(baseEntity);
        model.addAttribute("json", json);
        return "index";
    }
}
