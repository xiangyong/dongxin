/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.manager.user.impl;

import com.jd.kaopu.manager.user.IUserStateManager;
import com.jd.kaopu.domain.user.UserState;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 周飞
 */
@Transactional
@Service("userstatemanager")
public class UserStateManagerImpl implements IUserStateManager {
    
    private static final Logger log = Logger.getLogger(UserStateManagerImpl.class);

    @Autowired
    private IUserStateManager userstatemanager;

    @Override
    public boolean addUserState(UserState userstate) {
        return userstatemanager.addUserState(userstate);
    }

    @Override
    public boolean updateUserState(UserState userstate) {
        return userstatemanager.updateUserState(userstate);
    }

    @Override
    public int count(UserState userstate) {
        return userstatemanager.count(userstate);
    }

    @Override
    public List<UserState> listUserState(UserState userstate) {
        return userstatemanager.listUserState(userstate);
    }

}
