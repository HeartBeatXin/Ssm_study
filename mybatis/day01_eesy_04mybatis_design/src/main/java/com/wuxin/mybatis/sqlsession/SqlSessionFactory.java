package com.wuxin.mybatis.sqlsession;

/**
 * @author wuxin
 * @create 2020-03-29-17:14
 */
public interface SqlSessionFactory {
    SqlSession openSession();
}
