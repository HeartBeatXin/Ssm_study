package com.wuxin.mybatis.utils;

import com.wuxin.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author wuxin
 * @create 2020-03-29-19:07
 * 用于创建数据源的工具类
 */
public class DataSourceUtil {
    //用于获取连接
    public static Connection getConnection(Configuration cfg){
        try {
            Class.forName(cfg.getDriver());
         return   DriverManager.getConnection(cfg.getUrl(), cfg.getUsername(), cfg.getPassword());
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }

    }
}
