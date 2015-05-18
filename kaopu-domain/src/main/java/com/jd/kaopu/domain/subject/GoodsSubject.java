/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.subject;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 周飞
 */
public class GoodsSubject implements Serializable{

    private int id;
    private int skuid;
    private List<Subject> subject;

    public GoodsSubject() {
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

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "GoodsSubject{" + "id=" + id + ", skuid=" + skuid + ", subject=" + subject + '}';
    }

}
