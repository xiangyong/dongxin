/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.user;

/**
 * 用户日志接口
 * @author 周飞
 */
public interface IUserLogDao {

    // 保存数据
    public void add(UserLog userlog);

    // 更新数据
    public void update(UserLog userlog);

    // 查选用户数目
    public int count(UserLog userlog);
}
