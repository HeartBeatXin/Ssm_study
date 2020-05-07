package com.wuxin.ui;

import com.wuxin.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层调用业务层
 * @author wuxin
 * @create 2020-04-17 15:10
 */
public class Client {

    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountServiceImpl");
//        System.out.println(as);
//        IAccountDao acdo = ac.getBean("accountDao",IAccountDao.class);
//        System.out.println(acdo);
        as.saveAccount();

    }
}
