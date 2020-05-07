package com.wuxin.mybatis.sqlsession.defaults;

import com.wuxin.mybatis.cfg.Configuration;
import com.wuxin.mybatis.sqlsession.SqlSession;
import com.wuxin.mybatis.sqlsession.proxy.MapperProxy;
import com.wuxin.mybatis.utils.DataSourceUtil;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author wuxin
 * @create 2020-03-29-18:23
 * SqlSession接口的实现
 */
public class DefaultSqlSession implements SqlSession {
    private Configuration cfg;
    private Connection connection;

    public DefaultSqlSession(Configuration cfg) {
        this.cfg = cfg;
        connection = DataSourceUtil.getConnection(cfg);
    }

    /**
     * 用于创建代理对象
     *
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(), new Class[]{daoInterfaceClass}, new MapperProxy(cfg.getMappers(),connection));
        return null;
    }

    /**
     * 用于释放资源
     */

    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
