/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.goods;

import java.io.Serializable;

/**
 * 用户商品列表，以供数据初始化
 * @author 周飞
 */
public class Goods implements Serializable {

    // id
    private int id;
    // 用户pin
    private String pin;
    // SKU
    private int skuid;
    // 商品分类
    private String classify;
    // 来源类型【1购物车，2浏览记录，3已购买，4关注列表，5其他】
    private int from_type;
    // 是否有效【0无效，1正常，2和谐】
    private int yn;

    public Goods() {
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

    public int getSkuid() {
        return skuid;
    }

    public void setSkuid(int skuid) {
        this.skuid = skuid;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public int getFrom_type() {
        return from_type;
    }

    public void setFrom_type(int from_type) {
        this.from_type = from_type;
    }

    public int getYn() {
        return yn;
    }

    public void setYn(int yn) {
        this.yn = yn;
    }

    @Override
    public String toString() {
        return "Goods{" + "id=" + id + ", pin=" + pin + ", skuid=" + skuid + ", classify=" + classify + ", from_type=" + from_type + ", yn=" + yn + '}';
    }

}
