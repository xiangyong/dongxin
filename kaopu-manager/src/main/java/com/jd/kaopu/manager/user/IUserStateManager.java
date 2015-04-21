/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.manager.user;

import com.jd.kaopu.domain.user.UserState;
import java.util.List;

/**
 *
 * @author 周飞
 */
public interface IUserStateManager {

    /**
     * 初始化用户状态信息
     * @param userstate
     * @return 
     */
    public boolean addUserState(UserState userstate);

    /**
     * 更新用户状态
     * @param userstate
     * @return 
     */
    public boolean updateUserState(UserState userstate);

    /**
     * 查询符合某一特征的用户数[例如：查询在线人数]
     * @param userstate
     * @return 
     */
    public int count(UserState userstate);
    
    /**
     * 获取符合某一特征的所有用户[例如：查询在线人数列表]
     * @param userstate
     * @return 
     */
    public List<UserState> listUserState(UserState userstate);
}
