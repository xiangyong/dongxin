/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jd.kaopu.base;

import java.util.List;

/**
 * 基本接口
 * @author 周飞
 * @param <T>
 */
public interface IBaseDao<T> {

    // 保存数据
    public boolean add(T t);
    
    // 更新数据
    public boolean update(T t);

    // 删除数据
    public boolean delete(T t);

    // 查询数据
    public List<T> list(T t);

    // 根据ID查询数据
    public T getObjById(int id);
}
