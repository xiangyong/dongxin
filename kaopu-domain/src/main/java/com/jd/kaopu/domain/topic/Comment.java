/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.domain.topic;

import java.io.Serializable;
import java.util.Date;

/**
 * 话题的评论和回复 
 *【评论回复】包括【主题，评论回复人，被评论回复人，回复内容，评论回复时间，回复数，点赞数，是否有效】
 * @author 周飞
 */
public class Comment implements Serializable {

    // id
    private int id;
    // 话题
//    private Topic topic;
    // 话题ID
    private int topicid;
    // 回复评论人
    private String from;
    // 被评论回复人（为空表示为直接评论回复主题）
    private String to;
    // 评论回复的内容
    private String content;
    // 评论回复时间
    private Date create;
    // 是否有效【0无效，1正常，2和谐】
    private int yn;
    // 当前话题回复数
    private int reply_count;
    // 当前话题点赞数
    private int praise_count;

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTopicid() {
        return topicid;
    }

    public void setTopicid(int topicid) {
        this.topicid = topicid;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "Comment{" + "id=" + id + ", topicid=" + topicid + ", from=" + from + ", to=" + to + ", content=" + content + ", create=" + create + ", yn=" + yn + ", reply_count=" + reply_count + ", praise_count=" + praise_count + '}';
    }

}
