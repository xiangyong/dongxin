/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.manager.user.impl;

import com.jd.dongxin.common.util.UserEnum;
import com.jd.kaopu.dao.user.IUserDao;
import com.jd.kaopu.dao.user.IUserStateDao;
import com.jd.kaopu.manager.user.IUserManager;
import com.jd.kaopu.domain.user.User;
import com.jd.kaopu.domain.user.UserState;
import java.util.Date;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 周飞
 */
@Transactional
@Component(value = "usermanager")
public class UserManagerImpl implements IUserManager {

    private static final Logger log = Logger.getLogger(UserManagerImpl.class);

    @Autowired
    private IUserDao userdao;
    @Autowired
    private IUserStateDao userstatedao;

    @Override
    public User userLogin(User user) {
        List<User> users = userdao.list(user);
        if (CollectionUtils.isNotEmpty(users)) {
            UserState us = new UserState();
            user = users.get(0);
            user.setOnline(UserEnum.ONLINE.getValue());
            user.setLast(new Date());
            // 更改上线状态
            userstatedao.add(us);
            userdao.update(user);
            return user;
        }
        return null;
    }

    @Override
    public boolean userLogout(User user) {
        user.setOnline(UserEnum.OUTLINE.getValue());
        try {
            userdao.update(user);
            return true;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
    }

    @Override
    public User userRegister(User user) {
        userdao.add(user);
        // 刷新数据
        user = userdao.list(user).get(0);
        // 初始化状态表
        userstatedao.add(initUserState(user));
        return user;
    }

    /**
     * 初始化用户状态信息
     * @param user
     */
    private UserState initUserState(User user) {
        UserState us = new UserState();
        us.setAsks_count(0);
        us.setCart_count(0);
        us.setFriends_count(0);
        us.setJdou_count(0);
        us.setNotice_count(0);
        us.setReplys_count(0);
        return us;
    }
}
