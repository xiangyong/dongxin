/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.dao.user.impl;

import com.jd.kaopu.dao.base.impl.BaseDaoImpl;
import com.jd.kaopu.dao.user.IUserLogDao;
import com.jd.kaopu.domain.user.UserLog;
import org.springframework.stereotype.Repository;

/**
 * 用户日志
 * @author 周飞
 */
@Deprecated
@Repository("userlogdao")
public class UserLogDaoImpl extends BaseDaoImpl<UserLog, Integer> implements IUserLogDao {

    private static final String TAG = UserLogDaoImpl.class.getSimpleName().toLowerCase();

    @Override
    public String getTAG() {
        return TAG;
    }

    @Override
    public int count(UserLog entity) {
        return super.count(entity);
    }

    @Override
    public void update(UserLog entity) {
        super.update(entity);
    }

    @Override
    public void add(UserLog entity) {
        super.add(entity);
    }

}
