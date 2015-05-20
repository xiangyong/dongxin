/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.topic;

import com.jd.kaopu.domain.topics.Topic;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户发布的话题 话题包括【话题发起人，标题，内容，图片，主题（暂定标签），发布时间，回复数，点赞数，以及话题状态】
 * 话题属于【评论回复】的父节点，是评论回复的发起点
 * @author 周飞
 */
public class TopicQuiz implements Serializable {

    // id
    private int id;
    // 话题发起人
    private String pin;
    // 标题
    private String title;
    // 大内容需要单独储存
    private TopicQuizContent centent;
    // 话题
    private List<Topic> topic;
    // 上传的图片地址，多张以【；】分开
    private String images;
    // 发起时间
    private Date create;
    // 是否有效【0无效，1正常，2和谐】
    private int yn;
    // 当前话题回复数
    private int replyCount;
    // 当前话题点赞数
    private int praiseCount;

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

    public TopicQuizContent getCentent() {
        return centent;
    }

    public void setCentent(TopicQuizContent centent) {
        this.centent = centent;
    }

    public List<Topic> getTopic() {
        return topic;
    }

    public void setTopic(List<Topic> topic) {
        this.topic = topic;
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

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(int praiseCount) {
        this.praiseCount = praiseCount;
    }

    @Override
    public String toString() {
        return "TopicQuiz{" + "id=" + id + ", pin=" + pin + ", title=" + title + ", centent=" + centent + ", topic=" + topic + ", images=" + images + ", create=" + create + ", yn=" + yn + ", replyCount=" + replyCount + ", praiseCount=" + praiseCount + '}';
    }

}
