/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.manager.user.impl;

import com.jd.kaopu.dao.user.IUserStateDao;
import com.jd.kaopu.manager.user.IUserStateManager;
import com.jd.kaopu.domain.user.UserState;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 周飞
 */
@Transactional
@Component(value = "userstatemanager")
public class UserStateManagerImpl implements IUserStateManager {

    private static final Logger log = Logger.getLogger(UserStateManagerImpl.class);

    @Autowired
    private IUserStateDao userstatedao;

    @Override
    public boolean addUserState(UserState userstate) {
        try {
            userstatedao.add(userstate);
            return true;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }

    @Override
    public boolean updateUserState(UserState userstate) {
        try {
            userstatedao.update(userstate);
            return true;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }

    @Override
    public int count(UserState userstate) {
        return userstatedao.count(userstate);
    }

    @Override
    public List<UserState> listUserState(UserState userstate) {
        return userstatedao.list(userstate);
    }

}
