/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.service.user.impl;

import com.jd.kaopu.manager.user.IUserManager;
import com.jd.kaopu.service.user.IUserService;
import com.jd.kaopu.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 用户相关
 * @author 周飞
 */
@Service("userservice")
public class UserServiceImpl implements IUserService {
    
    @Autowired
    @Qualifier("usermanager")
    private IUserManager usermanager;

    @Override
    public User userLogin(String username, String pwd, String client) {
        User user = new User(username, pwd);
        return usermanager.userLogin(user);
    }
    

}
