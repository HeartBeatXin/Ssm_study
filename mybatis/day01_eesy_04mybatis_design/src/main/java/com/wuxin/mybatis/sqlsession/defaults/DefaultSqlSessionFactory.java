package com.wuxin.mybatis.sqlsession.defaults;

import com.wuxin.mybatis.cfg.Configuration;
import com.wuxin.mybatis.sqlsession.SqlSession;
import com.wuxin.mybatis.sqlsession.SqlSessionFactory;

/**
 * @author wuxin
 * @create 2020-03-29-18:15
 * SqlSessionFactiry接口的实现类
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;
    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg=cfg;
    }
    /**
     * 用于创建新的操作数据库对象
     * @return
     */
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
