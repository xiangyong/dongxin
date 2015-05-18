/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.topic;

import java.io.Serializable;
import java.util.Date;

/**
 * 点赞表
 * @author 周飞
 */
public class Praise implements Serializable {

    private int id;
    // 话题
//    private Topic topic;
    // 话题ID
    private int topicid;
    // 回复评论人
    private String pin;
    // 评论回复时间
    private Date create;
    // 是否有效赞【0无效，1正常，2和谐】
    private int yn;
    // 赞的话题类型【0直接话题，1话题的评论回复】
    private int type;

    public Praise() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTopicid() {
        return topicid;
    }

    public void setTopicid(int topicid) {
        this.topicid = topicid;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public int getYn() {
        return yn;
    }

    public void setYn(int yn) {
        this.yn = yn;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Praise{" + "id=" + id + ", topicid=" + topicid + ", pin=" + pin + ", create=" + create + ", yn=" + yn + ", type=" + type + '}';
    }

}
