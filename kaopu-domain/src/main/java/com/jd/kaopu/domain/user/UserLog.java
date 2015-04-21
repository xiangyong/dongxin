/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.user;

import java.util.Date;

/**
 * 用户日志
 * @author 周飞
 */
public class UserLog {

    private int id;
    // 日志记录时间
    private Date logdate;
    // 用户ID
    private int userid;
    // 用户名
    private String name;
    // 描述
    private String description;
    // 终端
    private String client;

    public UserLog() {
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

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "UserLog{" + "id=" + id + ", logdate=" + logdate + ", userid=" + userid + ", name=" + name + ", description=" + description + ", client=" + client + '}';
    }

}
