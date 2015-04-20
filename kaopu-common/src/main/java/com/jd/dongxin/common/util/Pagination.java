/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.dongxin.common.util;

/**
 * 分页参数
 * @author 周飞
 */
public class Pagination {

    // 第几页
    private int page;
    // 每页显示记录行数
    private int rows;

    public Pagination() {
    }

    public Pagination(int page, int rows) {
        this.page = page;
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Pagination{" + "page=" + page + ", rows=" + rows + '}';
    }

}
