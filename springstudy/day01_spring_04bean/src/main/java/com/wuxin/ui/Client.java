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
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //2.根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        as.saveAccount();
        //手动关闭
        ac.close();
    }
}
