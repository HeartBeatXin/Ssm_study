package com.wuxin.ui;

import com.wuxin.dao.IAccountDao;
import com.wuxin.service.IAccountService;
import com.wuxin.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 模拟表现层调用业务层
 * @author wuxin
 * @create 2020-04-17 15:10
 */
public class Client {
    /**
     * 获取spring的ioc核心容器，并根据id获取对象。
     * ApplicationContext的三个常用实现类
     *         ClassPathXmlApplicationContext:它可以加载类路径下的配置文件，要求配置文件必须在类路径下，不然加载不了
     *         FileSystemXmlApplicationContext：它可以加载磁盘任意路径下的配置文件(必须有访问权限)
     *         AnnotationConfigApplicationContext：他是用于读取注解创建容器的。
     * 核心容器的两个接口引发出的问题
     * ApplicationContext：单例对象适用
     * 他在构建核心容器时，创建对象采取的策略是采用立即加载的方式，也就是说，只要一读取完马上就创建配置文件中配置的对象
     * BeanFactory：多例对象适用
     * 他在构建核心容器时，创建对象采取的策略是采用延迟加载的方式，也就是什么时候根据id获取对象了，什么时候才真正创建对象。
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\DailyDocuments\\dailydata\\springstudy\\day03_spring_03spring\\src\\main\\resources\\bean.xml");
        //2.根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        IAccountDao adao = ac.getBean("accountDao", IAccountDao.class);
        System.out.println(as);
        System.out.println(adao);
       // as.saveAccount();
    }
}
