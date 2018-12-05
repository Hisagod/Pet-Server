package com.aib.controller;

import com.aib.service.impl.LoginServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class LoginController {
    @Resource
    LoginServiceImpl loginService;

    @RequestMapping("/index")
    public String userLogin() {
        loginService.login();
        return "index";
    }
}
