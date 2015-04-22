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
public class UserState implements Serializable{

    private int id;
    // 用户ID
    private int userid;
    // 是否在线[0标示离线，1标示在线]
    private int online;
    // 最后一次登陆时间
    private Date last_login;
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

    public UserState() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
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

    @Override
    public String toString() {
        return "UserState{" + "id=" + id + ", userid=" + userid + ", online=" + online + ", last_login=" + last_login + ", replys_count=" + replys_count + ", asks_count=" + asks_count + ", jdou_count=" + jdou_count + ", friends_count=" + friends_count + ", notice_count=" + notice_count + ", cart_count=" + cart_count + '}';
    }

}
