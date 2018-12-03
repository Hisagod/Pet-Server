package com.aib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/index")
    public ModelAndView userLogin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("json", "小黑黑");
        return modelAndView;
    }
}
