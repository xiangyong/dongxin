/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.manager.user;

import com.jd.kaopu.domain.user.User;

/**
 *
 * @author 周飞
 */
public interface IUserManager {

    /**
     * 用户登陆操作
     * @param user
     * @return 
     */
    public User userLogin(User user);

    /**
     * 用户退出操作
     * @param user
     * @return 
     */
    public boolean userLogout(User user);
    
    /**
     * 用户注册操作
     * @param user
     * @return 
     */
    public User userRegister(User user);
}
