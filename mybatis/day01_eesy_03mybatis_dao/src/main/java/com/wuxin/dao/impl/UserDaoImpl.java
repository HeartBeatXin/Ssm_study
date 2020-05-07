package com.wuxin.dao.impl;

import com.wuxin.dao.IUserDao;
import com.wuxin.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author wuxin
 * @create 2020-03-23-22:15
 */
public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;
    public UserDaoImpl(SqlSessionFactory factory){
        this.factory=factory;
    }

    public List<User> findAll(){
        //1.使用工厂创建sqlsession对象
        SqlSession session=factory.openSession();
        //2.使用session执行查询所有方法
        List<User> users=session.selectList("com.wuxin.dao.IUserDao.findAll");
        session.close();
        //3.返回查询列国
        return users;
    }
}
