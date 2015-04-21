/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.user.impl;

import com.jd.kaopu.base.impl.BaseDaoImpl;
import com.jd.kaopu.user.IUserDao;
import com.jd.kaopu.user.User;

/**
 * 用户信息
 * @author 周飞
 */
public class UserDaoImpl extends BaseDaoImpl<User, Integer> implements IUserDao {

    private static final String TAG = UserLogDaoImpl.class.getSimpleName().toLowerCase();

    @Override
    public String getTAG() {
        return TAG;
    }

}
