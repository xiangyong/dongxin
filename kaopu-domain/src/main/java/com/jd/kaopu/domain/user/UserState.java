/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户的状态
 * @author 周飞
 */
public class UserState implements Serializable {

    private int id;
    // 用户ID
    private String pin;
    // 所有的回复数量
    private int replysCount;
    // 所有的询问数量
    private int asksCount;
    // 已有的京豆数量
    private int jdouCount;
    // 所有的朋友数量
    private int friendsCount;
    // 当前通知数量
    private int noticeCount;
    // 购物车数量
    private int cartCount;
    // 最后一次更新时间
    private Date lastUpdate;

    public UserState() {
    }

    @Override
    public String toString() {
        return "UserState{" + "id=" + id + ", pin=" + pin + ", replys_count=" + replysCount + ", asks_count=" + asksCount + ", jdou_count=" + jdouCount + ", friends_count=" + friendsCount + ", notice_count=" + noticeCount + ", cart_count=" + cartCount + ", last_update=" + lastUpdate + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getReplysCount() {
        return replysCount;
    }

    public void setReplysCount(int replysCount) {
        this.replysCount = replysCount;
    }

    public int getAsksCount() {
        return asksCount;
    }

    public void setAsksCount(int asksCount) {
        this.asksCount = asksCount;
    }

    public int getJdouCount() {
        return jdouCount;
    }

    public void setJdouCount(int jdouCount) {
        this.jdouCount = jdouCount;
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(int friendsCount) {
        this.friendsCount = friendsCount;
    }

    public int getNoticeCount() {
        return noticeCount;
    }

    public void setNoticeCount(int noticeCount) {
        this.noticeCount = noticeCount;
    }

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
