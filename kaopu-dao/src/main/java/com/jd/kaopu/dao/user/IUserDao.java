/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.dao.user;

import com.jd.kaopu.domain.user.User;
import java.util.List;

/**
 * 用户接口
 * @author 周飞
 */
public interface IUserDao {

    // 保存数据
    public void add(User user);

    // 更新数据
    public void update(User user);
    
    // 查找用户数目
    public int count(User user);
    
    // 查找用户
    public List<User> list(User user);
}
