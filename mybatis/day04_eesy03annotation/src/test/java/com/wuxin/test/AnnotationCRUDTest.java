package com.wuxin.test;

import com.wuxin.damain.User;
import com.wuxin.dao.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author wuxin
 * @create 2020-04-06 7:33
 */
public class AnnotationCRUDTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IUserDao userDao;
     @Before
    public void init() throws Exception {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session=factory.openSession();
        userDao = session.getMapper(IUserDao.class);
    }
    @After
    public void destroy() throws Exception{
         session.commit();
         session.close();
         in.close();
    }
    @Test
    public void testSaveUser(){
        User user=new User();
        user.setUsername("mybatis annotation");
        user.setAddress("北京市昌平区");
        user.setSex("男");
        userDao.saveUser(user);
    }
    @Test
    public void testUpdateUser(){
        User user=new User();
        user.setId(64);
        user.setUsername("mybatis annotation update");
        user.setAddress("北京市昌平区");
        user.setSex("男");
        user.setBirthday(new Date());
        userDao.updateUser(user);

    }
    @Test
    public void testDeleteUser(){
        userDao.deleteUser(63);

    }
    @Test
    public void testFindById(){
     User user=   userDao.findById(64);
        System.out.println(user);
    }
    @Test
    public void testFindByName(){

        List<User> users = userDao.findUserByName("%mybatis%");
//        List<User> users = userDao.findUserByName("mybatis");

        for(User user:users) {
            System.out.println(user);
        }
    }
    @Test
    public void testFindToTal(){
        int num=   userDao.findToTalUser();
        System.out.println(num);
    }


}






