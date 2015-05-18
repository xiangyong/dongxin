/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.topic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.security.auth.Subject;

/**
 * 用户发布的话题 话题包括【话题发起人，标题，内容，图片，主题（暂定标签），发布时间，回复数，点赞数，以及话题状态】
 * 话题属于【评论回复】的父节点，是评论回复的发起点
 * @author 周飞
 */
public class Topic implements Serializable {

    // id
    private int id;
    // 话题发起人
    private String pin;
    // 标题
    private String title;
    // 大内容需要单独储存
//    private TopicContent centent;
//    private int cententid;
    // 话题内容
    private String centent;
    // 主题标签
    private List<Subject> subject;
    // 上传的图片地址，多张以【；】分开
    private String images;
    // 发起时间
    private Date create;
    // 是否有效【0无效，1正常，2和谐】
    private int yn;
    // 当前话题回复数
    private int reply_count;
    // 当前话题点赞数
    private int praise_count;

    public Topic() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCentent() {
        return centent;
    }

    public void setCentent(String centent) {
        this.centent = centent;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
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

    public int getReply_count() {
        return reply_count;
    }

    public void setReply_count(int reply_count) {
        this.reply_count = reply_count;
    }

    public int getPraise_count() {
        return praise_count;
    }

    public void setPraise_count(int praise_count) {
        this.praise_count = praise_count;
    }

    @Override
    public String toString() {
        return "Topic{" + "id=" + id + ", pin=" + pin + ", title=" + title + ", centent=" + centent + ", subject=" + subject + ", images=" + images + ", create=" + create + ", yn=" + yn + ", reply_count=" + reply_count + ", praise_count=" + praise_count + '}';
    }

}
