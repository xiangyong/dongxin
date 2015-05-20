/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.topics;

import java.io.Serializable;
import java.util.Date;

/**
 * 话题对象 话题包含【名称，创建时间，创建人，以及有效性】
 * @author 周飞
 */
public class Topic implements Serializable {

    // 话题ID
    private int id;
    // 父话题
    private Topic ptopic;
    // 话题名字
    private String name;
    // 话题创建时间
    private Date create;
    // 话题创建的pin
    private String pin;
    // 该话题对应分类ID或者SKU
    private int cid;
    // 话题讨论类型(1表示分类，2表示SKU)
    private int type;
    // 话题引用次数
    private int count;
    // 话题有效性【0无效，1正常，2和谐】
    private int yn;

    public Topic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Topic getPtopic() {
        return ptopic;
    }

    public void setPtopic(Topic ptopic) {
        this.ptopic = ptopic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getYn() {
        return yn;
    }

    public void setYn(int yn) {
        this.yn = yn;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Topic{" + "id=" + id + ", ptopic=" + ptopic + ", name=" + name + ", create=" + create + ", pin=" + pin + ", cid=" + cid + ", type=" + type + ", count=" + count + ", yn=" + yn + '}';
    }

}
