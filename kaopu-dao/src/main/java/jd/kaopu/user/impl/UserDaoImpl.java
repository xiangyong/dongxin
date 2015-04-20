/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jd.kaopu.user.impl;

import jd.kaopu.base.impl.BaseDaoImpl;
import jd.kaopu.user.IUserDao;
import jd.kaopu.user.User;

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
