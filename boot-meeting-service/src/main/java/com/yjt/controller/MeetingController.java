package com.yjt.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.yjt.entity.Meeting;
import com.yjt.entity.User;
import com.yjt.service.MeetingService;
import com.yjt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/meeting")
public class MeetingController {

    @Autowired
    MeetingService meetingService;
    @Reference(check = false) //dubbo 远程服务调用
    UserService userService;

    @ResponseBody
    @RequestMapping("/list")
    public String list(){

        Meeting meeting = meetingService.selectByUid(1);
        User user = userService.selectById(meeting.getUid());
        meeting.setUser(user);

        return JSON.toJSONString(meeting);
    }
}
