package com.wuxin.mybatis.sqlsession;

import com.wuxin.mybatis.cfg.Configuration;
import com.wuxin.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.wuxin.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @author wuxin
 * @create 2020-03-29-16:33
 * 用于创建SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {
    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg= XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);

    }

}
