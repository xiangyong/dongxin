/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.goods;

import java.io.Serializable;
import java.util.List;

/**
 * 用户商品圈子 包括【圈子主体SKU，圈子内的用户】
 * @author 周飞
 */
public class Circles implements Serializable {

    // 圈子ID
    private int id;
    // 商品SKU
    private int skuid;
    // 圈子内的用户
    private List<String> pins;

    public Circles() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSkuid() {
        return skuid;
    }

    public void setSkuid(int skuid) {
        this.skuid = skuid;
    }

    public List<String> getPins() {
        return pins;
    }

    public void setPins(List<String> pins) {
        this.pins = pins;
    }

    @Override
    public String toString() {
        return "Circles{" + "id=" + id + ", skuid=" + skuid + ", pins=" + pins + '}';
    }

}
