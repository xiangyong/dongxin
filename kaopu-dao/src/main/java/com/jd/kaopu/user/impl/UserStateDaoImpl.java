/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.user.impl;

import com.jd.kaopu.base.impl.BaseDaoImpl;
import com.jd.kaopu.user.IUserStateDao;
import com.jd.kaopu.user.UserState;

/**
 * 用户状态
 * @author 周飞
 */
public class UserStateDaoImpl extends BaseDaoImpl<UserState, Integer> implements IUserStateDao {

    private static final String TAG = UserLogDaoImpl.class.getSimpleName().toLowerCase();

    @Override
    public String getTAG() {
        return TAG;
    }
}
