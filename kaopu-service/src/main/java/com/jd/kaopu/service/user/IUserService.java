/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.service.user;

import com.jd.kaopu.domain.user.User;

/**
 * 用户相关操作
 * @author 周飞
 */
public interface IUserService {

    public User userLogin(String username, String pwd, String client);
}
