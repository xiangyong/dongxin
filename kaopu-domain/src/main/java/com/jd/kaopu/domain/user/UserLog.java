/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户日志
 * @author 周飞
 */
public class UserLog implements Serializable {

    private int id;
    // 用户名
    private String pin;
    // 日志记录时间
    private Date logdate;
    // 登录端类型
    private int client;
    // ip
    private String ip;
    // 登录位置
    private String local;
    // 描述
    private String description;

    public UserLog() {
    }

    @Override
    public String toString() {
        return "UserLog{" + "id=" + id + ", pin=" + pin + ", logdate=" + logdate + ", client=" + client + ", ip=" + ip + ", local=" + local + ", description=" + description + '}';
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

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
