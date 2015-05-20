/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.topics;

import java.io.Serializable;
import java.util.List;

/**
 * 用户关注的话题
 * @author 周飞
 */
public class UserTopic implements Serializable {

    // id
    private int id;
    // 用户
    private String pin;
    // 用户关注的话题列表
    private List<Topic> topic;

    public UserTopic() {
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

    public List<Topic> getTopic() {
        return topic;
    }

    public void setTopic(List<Topic> topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "UserTopic{" + "id=" + id + ", pin=" + pin + ", topic=" + topic + '}';
    }

}
