/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jd.kaopu.dao.base.impl;

import com.jd.dongxin.common.util.Pagination;
import java.io.Serializable;
import java.util.List;
import com.jd.kaopu.dao.base.IBaseDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 基本的数据库操作DAO
 * @author 周飞
 * @param <T>
 * @param <PK>
 */
@Repository
public class BaseDaoImpl<T, PK extends Serializable> extends SqlSessionDaoSupport implements IBaseDao<T, PK> {

    private static final String TAG = BaseDaoImpl.class.getSimpleName().toLowerCase();
    private static final String SQL_ADD = "_add";
    private static final String SQL_ADDS = "_adds";
    private static final String SQL_UPDATE = "_update";
    private static final String SQL_UPDATES = "_updates";
    private static final String SQL_DELETE = "_delete";
    private static final String SQL_DELETES = "_deletes";
    private static final String SQL_LIST = "_list";
    private static final String SQL_LIST_PAGE = "_listpage";
    private static final String SQL_COUNT = "_count";
    private static final String SQL_GET = "_get";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void add(T entity) {
        sqlSessionTemplate.insert(getTAG() + SQL_ADD, entity);
    }

    @Override
    public void update(T entity) {
        sqlSessionTemplate.update(getTAG() + SQL_UPDATE, entity);
    }

    @Override
    public void delete(T entity) {
        sqlSessionTemplate.delete(getTAG() + SQL_DELETE, entity);
    }

    @Override
    public List<T> list(T entity) {
        return sqlSessionTemplate.selectList(getTAG() + SQL_LIST, entity);
    }

    @Override
    public List<T> list(T entity, Pagination page) {
        return sqlSessionTemplate.selectList(getTAG() + SQL_LIST_PAGE, entity);
    }

    @Override
    public T get(int PK) {
        return sqlSessionTemplate.selectOne(getTAG() + SQL_GET, PK);
    }

    @Override
    public int count(T entity) {
        return sqlSessionTemplate.selectOne(getTAG() + SQL_COUNT, entity);
    }

    @Override
    public void add(List<T> entitys) {
        sqlSessionTemplate.insert(getTAG() + SQL_ADDS, entitys);
    }

    @Override
    public void update(List<T> entitys) {
        sqlSessionTemplate.update(getTAG() + SQL_UPDATES, entitys);
    }

    @Override
    public void delete(List<PK> entitys) {
        sqlSessionTemplate.delete(getTAG() + SQL_DELETES, entitys);
    }

    public String getTAG() {
        return TAG;
    }
}
