package com.wuxin.factory;

import com.wuxin.service.IAccountService;
import com.wuxin.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类（该类可能是存在于jar包中的，我们无法通过修改源码的方式提供默认构造函数）
 * @author wuxin
 * @create 2020-04-24 9:01
 */
public class InstanceFactory {
    public IAccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
