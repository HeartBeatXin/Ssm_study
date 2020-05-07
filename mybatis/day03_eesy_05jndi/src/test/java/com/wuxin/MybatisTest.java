package com.wuxin;

import com.wuxin.damain.QueryVo;
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
import java.sql.Date;
import java.util.List;

/**
 * @author wuxin
 * @create 2020-03-30-12:25
 * 测试mybatis的crud操作
 */
public class MybatisTest {
    private InputStream in;
    private SqlSession sqlsession;
    private IUserDao userDao;

    @Before//用于在测试方法执行之前执行
    public void init() throws Exception {
        // 1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSessin对象
        sqlsession = factory.openSession();
        //4.获取dao的代理对象
        userDao = sqlsession.getMapper(IUserDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy() throws Exception {
        //6.提交事务
        sqlsession.commit();
        //释放资源
        sqlsession.close();
        in.close();
    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindALl() {
        //5.执行查询所有方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试保存操作
     */
    @Test
    public void testSave() {
        User user = new User();
        user.setUserName("mybatis last insertid");
        user.setUserAddress("北京市顺义区");
        user.setUserSex("男");
        user.setUserBirthday(new Date(2010 - 10 - 10));
        System.out.println("保存操作之前" + user);
        //5.执行保存方法
        userDao.savaUser(user);
        System.out.println("保存操作之后" + user);


    }

    /**
     * 测试更新操作
     */
    @Test
    public void testUpdate() {
        User user = new User();
        user.setUserId(60);
        user.setUserName("mybatis updateUser");
        user.setUserAddress("北京市顺义区");
        user.setUserSex("女");
        user.setUserBirthday(new Date(2010));
        //5.执行更新方法
        userDao.updateUser(user);
    }

    /**
     * 测试删除操作
     */
    @Test
    public void testDelete() {
        //5.执行删除方法
        userDao.deleteUser(61);

    }

    /**
     * 测试用户id查询
     */
    @Test
    public void testFindOne() {
        //5.执行查询方法
        User users = userDao.findById(60);
        System.out.println(users);
    }

    /**
     * 测试模糊查询
     */
    @Test
    public void testFindByName() {
        //5.执行模糊查询方法
        List<User> users = userDao.findByName("%王%");
//        List<User> users=userDao.findByName("王");
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试查询总人数
     */
    @Test
    public void testFindTotal() {
        //5.执行查询方法
        int num = userDao.findTotal();
        System.out.println(num);
    }

    /**
     * 测试使用QueryVo作为查询条件
     */
    @Test
    public void testFindByVo() {
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUserName("%王%");
        vo.setUser(user);
        //5.执行模糊查询方法
        List<User> users = userDao.findUserByVo(vo);
        for (User u : users) {
            System.out.println(u);
        }
    }
}
