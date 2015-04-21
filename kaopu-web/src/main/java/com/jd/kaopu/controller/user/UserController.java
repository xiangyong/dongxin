/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.controller.user;

import com.jd.kaopu.service.user.IUserService;
import com.jd.kaopu.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户相关
 * @author 周飞
 */
@Controller("usercontroller")
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userservice")
    private IUserService userservice;

    @RequestMapping(value = "/login/{name}/{pwd}/{client}", method = RequestMethod.POST)
    @ResponseBody
    public User userLogin(@PathVariable("name") String username,
            @PathVariable("pwd") String pwd, @PathVariable("client") String client) {
        System.out.println("username = " + username);
        System.out.println("pwd = " + pwd);
        System.out.println("client = " + client);
        return userservice.userLogin(username, pwd, client);
    }
}
