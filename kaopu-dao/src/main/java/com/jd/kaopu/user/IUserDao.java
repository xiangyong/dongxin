/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.user;

import jd.kaopu.user.User;

/**
 * 用户接口
 * @author 周飞
 */
public interface IUserDao {

    // 保存数据
    public void add(User user);

    // 更新数据
    public void update(User user);
    
    // 查选用户数目
    public int count(User user);
}
