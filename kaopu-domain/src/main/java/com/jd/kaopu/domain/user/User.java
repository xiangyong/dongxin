/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户登录信息
 * @author 周飞
 */
public class User implements Serializable {

    private static final long serialVersionUID = 7616947126248522289L;

    private int id;
    // 登陆账号
    private String name;
    // 登陆密码
    private String pwd;
    // 最后登录时间
    private Date last;
    // 是否在线[0标示离线，1标示在线]
    private int online;
    // 最后一次登录端类型
    private int client;
    // 最后一次登录ip
    private String ip;
    // 最后一次登录位置
    private String local;

    public User() {
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getLast() {
        return last;
    }

    public void setLast(Date last) {
        this.last = last;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", pwd=" + pwd + ", last=" + last + ", online=" + online + ", client=" + client + ", ip=" + ip + ", local=" + local + '}';
    }

}
