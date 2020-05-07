package com.wuxin.mybatis.sqlsession;

/**
 * @author wuxin
 * @create 2020-03-29-17:19
 * 自定义mybatis中和数据库交互的核心类
 * 它里面可以创建dao代理对象
 */
public interface SqlSession {
    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */

    <T>T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
