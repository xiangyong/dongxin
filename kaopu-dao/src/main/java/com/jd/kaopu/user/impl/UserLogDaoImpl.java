/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.user.impl;

import com.jd.kaopu.base.impl.BaseDaoImpl;
import com.jd.kaopu.user.IUserLogDao;
import com.jd.kaopu.user.UserLog;

/**
 * 用户日志
 * @author 周飞
 */
public class UserLogDaoImpl extends BaseDaoImpl<UserLog, Integer> implements IUserLogDao {

    private static final String TAG = UserLogDaoImpl.class.getSimpleName().toLowerCase();

    @Override
    public String getTAG() {
        return TAG;
    }

}
