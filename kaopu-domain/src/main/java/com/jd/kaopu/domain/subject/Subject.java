/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.subject;

import java.io.Serializable;
import java.util.Date;

/**
 * 主题对象 主题包含【名称，创建时间，创建人，以及有效性】
 * @author 周飞
 */
public class Subject implements Serializable {

    // 主题ID
    private int id;
    // 主题名字
    private String name;
    // 主题创建时间
    private Date create;
    // 主题创建的pin
    private String pin;
    // 主题引用次数
    private int count;
    // 主题有效性【0无效，1正常，2和谐】
    private int yn;

    public Subject() {
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

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", name=" + name + ", create=" + create + ", pin=" + pin + ", count=" + count + ", yn=" + yn + '}';
    }

}
