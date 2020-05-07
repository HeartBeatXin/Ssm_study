package com.wuxin.service.impl;

import com.wuxin.service.IAccountService;

/**
 * 账户业务层实现类
 * @author wuxin
 * @create 2020-04-17 14:53
 */
public class AccountServiceImpl implements IAccountService{
    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }
    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了");
    }
    public void init() {
        System.out.println("对象初始化了。。。");
    }
    public void destroy() {
        System.out.println("对象摧毁了。。。");
    }
}
