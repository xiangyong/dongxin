/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.user;

import java.io.Serializable;

/**
 * 用户基本信息表
 * @author 周飞
 */
public class UserInfo implements Serializable {

    // 用户
    private String pin;
    // 用户头像URL
    private String face;
    // 性别
    private int sex;
    // 年龄
    private int age;
    // 邮箱
    private String email;
    // 电话
    private String phone;
    // 定位地址
    private String local;
    // 出生年
    private int birth_year;
    // 出生月
    private int birth_mouth;
    // 出生日
    private int birth_day;
    // 省
    private String province;
    // 市
    private String city;
    // 微博账号
    private String weibo;
    // QQ账号
    private String qq;
    // VIP等级
    private int vip;
    // 用户等级
    private int level;
    // 网名
    private String netname;
    // 个性签名
    private String signature;

    public UserInfo() {
    }

    @Override
    public String toString() {
        return "UserInfo{" + "pin=" + pin + ", face=" + face + ", sex=" + sex + ", age=" + age + ", email=" + email + ", phone=" + phone + ", local=" + local + ", birth_year=" + birth_year + ", birth_mouth=" + birth_mouth + ", birth_day=" + birth_day + ", province=" + province + ", city=" + city + ", weibo=" + weibo + ", qq=" + qq + ", vip=" + vip + ", level=" + level + ", netname=" + netname + ", signature=" + signature + '}';
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public int getBirth_mouth() {
        return birth_mouth;
    }

    public void setBirth_mouth(int birth_mouth) {
        this.birth_mouth = birth_mouth;
    }

    public int getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(int birth_day) {
        this.birth_day = birth_day;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNetname() {
        return netname;
    }

    public void setNetname(String netname) {
        this.netname = netname;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

}
