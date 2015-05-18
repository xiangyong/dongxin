/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.subject;

import java.io.Serializable;
import java.util.List;

/**
 * 用户关注的主题
 * @author 周飞
 */
public class UserSubject implements Serializable {

    // id
    private int id;
    // 用户
    private String pin;
    // 用户关注的主题列表
    private List<Subject> subject;

    public UserSubject() {
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

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "UserSubject{" + "id=" + id + ", pin=" + pin + ", subject=" + subject + '}';
    }

}
