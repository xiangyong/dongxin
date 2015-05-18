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
    private int replys_count;
    // 所有的询问数量
    private int asks_count;
    // 已有的京豆数量
    private int jdou_count;
    // 所有的朋友数量
    private int friends_count;
    // 当前通知数量
    private int notice_count;
    // 购物车数量
    private int cart_count;
    // 最后一次更新时间
    private Date last_update;

    public UserState() {
    }

    @Override
    public String toString() {
        return "UserState{" + "id=" + id + ", pin=" + pin + ", replys_count=" + replys_count + ", asks_count=" + asks_count + ", jdou_count=" + jdou_count + ", friends_count=" + friends_count + ", notice_count=" + notice_count + ", cart_count=" + cart_count + ", last_update=" + last_update + '}';
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

    public int getReplys_count() {
        return replys_count;
    }

    public void setReplys_count(int replys_count) {
        this.replys_count = replys_count;
    }

    public int getAsks_count() {
        return asks_count;
    }

    public void setAsks_count(int asks_count) {
        this.asks_count = asks_count;
    }

    public int getJdou_count() {
        return jdou_count;
    }

    public void setJdou_count(int jdou_count) {
        this.jdou_count = jdou_count;
    }

    public int getFriends_count() {
        return friends_count;
    }

    public void setFriends_count(int friends_count) {
        this.friends_count = friends_count;
    }

    public int getNotice_count() {
        return notice_count;
    }

    public void setNotice_count(int notice_count) {
        this.notice_count = notice_count;
    }

    public int getCart_count() {
        return cart_count;
    }

    public void setCart_count(int cart_count) {
        this.cart_count = cart_count;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

}
