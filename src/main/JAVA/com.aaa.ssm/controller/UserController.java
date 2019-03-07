package com.aaa.ssm.controller;

import com.aaa.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * fileName:UserController
 * description:
 * austhor:欧州
 * createTime:2019/3/2 18:26
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService user;

    @ResponseBody
    @RequestMapping("/list")
    public Object list() {
            return user.selectUser();
    }
}
