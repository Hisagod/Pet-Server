package com.aib.controller;

import com.aib.entity.UserEntity;
import com.aib.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
public class LoginController {
    @RequestMapping("/index")
    public ModelAndView userLogin(HttpServletRequest request) throws IOException {
        String getPhone = request.getParameter("phone");
        String getPwd = request.getParameter("pwd");

        String res = "mybatis_cfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(res);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<UserEntity> data = mapper.findUserByName("15360060187");
//        System.out.println(userEntity.toString());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("json", "小黑黑");
        return modelAndView;
    }
}
