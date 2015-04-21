/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.dao.user.impl;

import com.jd.kaopu.dao.base.impl.BaseDaoImpl;
import com.jd.kaopu.dao.user.IUserDao;
import com.jd.kaopu.domain.user.User;
import org.springframework.stereotype.Repository;

/**
 * 用户信息
 * @author 周飞
 */
@Repository("userdao")
public class UserDaoImpl extends BaseDaoImpl<User, Integer> implements IUserDao {

    private static final String TAG = UserLogDaoImpl.class.getSimpleName().toLowerCase();

    @Override
    public String getTAG() {
        return TAG;
    }

}
