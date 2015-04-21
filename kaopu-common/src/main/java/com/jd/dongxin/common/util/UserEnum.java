/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.dongxin.common.util;

/**
 * 用户字典
 * @author 周飞
 */
public enum UserEnum {

    ONLINE(1), OUTLINE(0);
    private final int value;

    private UserEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
