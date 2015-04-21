/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.dao.base;

import com.jd.dongxin.common.util.Pagination;
import java.io.Serializable;
import java.util.List;

/**
 * 基本接口
 * @author 周飞
 * @param <T> 实体类
 * @param <PK> 主键
 */
public interface IBaseDao<T, PK extends Serializable> {

    // 保存数据
    public void add(T entity);

    // 更新数据
    public void update(T entity);

    // 删除数据
    public void delete(T entity);

    // 查询数据
    public List<T> list(T entity);

    // 查询数据【分页】
    public List<T> list(T entity, Pagination page);

    // 根据ID查询数据
    public T get(int PK);

    // 查询记录总数
    public int count(T entity);
    
    // 保存数据[批量]
    public void add(final List<T> entitys);

    // 更新数据[批量]
    public void update(final List<T> entitys);

    // 删除数据[批量]
    public void delete(final List<PK> entitys);
}
