/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.dao.user;

import com.jd.kaopu.domain.user.UserState;
import java.util.List;

/**
 * 用户状态接口
 * @author 周飞
 */
public interface IUserStateDao {
    
    // 保存数据
    public void add(UserState userstate);

    // 更新数据
    public void update(UserState userstate);

    // 查选用户数目
    public int count(UserState userstate);
    
    // 查询符合某一特征的用户状态列表
    public List<UserState> list(UserState userstate);
}
