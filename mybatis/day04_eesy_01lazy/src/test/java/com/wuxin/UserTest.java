package com.wuxin;

import com.wuxin.damain.Account;
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
import java.util.List;

/**
 * @author wuxin
 * @create 2020-03-30-12:25
 * 测试mybatis的crud操作
 */
public class UserTest {
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
    public void testFindAll(){
        List<User> users=userDao.findAll();
        for (User user : users) {
            System.out.println("-------------每个User的信息---------------");
            System.out.println(user);
           List <Account>accounts=user.getAccounts();
            for (Account account : accounts){
                System.out.println(account);
            }
        }

    }


}
