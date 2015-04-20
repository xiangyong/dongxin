/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jd.kaopu.user.impl;

import java.util.List;
import jd.kaopu.base.impl.BaseDaoImpl;
import jd.kaopu.user.IUserDao;
import jd.kaopu.user.User;

/**
 * 用户信息
 * @author 周飞
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{

    @Override
    public User getObjById(int id) {
        return super.getObjById(id); 
    }

    @Override
    public List<User> list(User t) {
        return super.list(t); 
    }

    @Override
    public boolean delete(User t) {
        return super.delete(t); 
    }

    @Override
    public boolean update(User t) {
        return super.update(t);
    }

    @Override
    public boolean add(User t) {
        return super.add(t);
    }
    
}
