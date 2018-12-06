package com.aib.controller;

import com.aib.entity.BaseEntity;
import com.aib.entity.RegisterEntity;
import com.aib.service.impl.UserServiceImpl;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserServiceImpl userService;

    /**
     * 用户注册
     *
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    String userRegister(RegisterEntity entity, Model model) {
        userService.register(entity);
        BaseEntity<String> baseEntity = new BaseEntity<>(200, "成功", "注册成功");
        String json = new Gson().toJson(baseEntity);
        model.addAttribute("json", json);
        return "index";
    }

    @RequestMapping("/index")
    public String findAllUser(Model model) {
        List<RegisterEntity> userEntities = userService.login();
        BaseEntity<List<RegisterEntity>> baseEntity = new BaseEntity<>(200, "成功", userEntities);
        String json = new Gson().toJson(baseEntity);
        model.addAttribute("json", json);
        return "index";
    }
}
