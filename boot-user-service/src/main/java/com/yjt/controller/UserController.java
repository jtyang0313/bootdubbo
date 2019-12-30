package com.yjt.controller;

import com.alibaba.fastjson.JSON;
import com.yjt.entity.User;
import com.yjt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/list")
    public String list(){
        User user = userService.selectById(1);

        return JSON.toJSONString(user);
    }
}
