/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.user.impl;

import com.jd.kaopu.user.IUserDao;
import com.jd.kaopu.user.IUserManager;
import jd.kaopu.user.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 周飞
 */
public class UserManagerImpl implements IUserManager {

    private static final Logger log = Logger.getLogger(UserManagerImpl.class);

    @Autowired
    private IUserDao userdao;

    @Override
    @Transactional
    public boolean addUser(User user) {
        try {
            userdao.add(user);
            return true;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }

    @Override
    @Transactional
    public boolean updateUser(User user) {
        try {
            userdao.update(user);
            return true;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }

    @Override
    public int count(User user) {
        return userdao.count(user);
    }

}
