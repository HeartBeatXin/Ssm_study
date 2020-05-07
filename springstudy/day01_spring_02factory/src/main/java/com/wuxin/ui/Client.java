package com.wuxin.ui;

import com.wuxin.factory.BeanFactory;
import com.wuxin.service.IAccountService;
import com.wuxin.service.impl.AccountServiceImpl;

/**
 * 模拟表现层调用业务层
 * @author wuxin
 * @create 2020-04-17 15:10
 */
public class Client {
    public static void main(String[] args) {
//        IAccountService as =new AccountServiceImpl();
        IAccountService as = (IAccountService)BeanFactory.getBean("accountService");
        as.saveAccount();
    }
}
