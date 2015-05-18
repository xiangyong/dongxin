/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.topic;

import java.io.Serializable;

/**
 * 话题内容单独存储
 * @author 周飞
 */
public class TopicContent implements Serializable {

    // 内容ID
    private int id;
    // 内容详情
    private String content;

    public TopicContent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TopicContent{" + "id=" + id + ", content=" + content + '}';
    }

}
