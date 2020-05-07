package com.wuxin.service.impl;

import com.wuxin.dao.IAccountDao;
import com.wuxin.factory.BeanFactory;
import com.wuxin.service.IAccountService;

/**
 * 账户业务层实现类
 * @author wuxin
 * @create 2020-04-17 14:53
 */
public class AccountServiceImpl implements IAccountService{
    //    private IAccountDao accountDao=new AccountDaoImpl();
    private IAccountDao accountDao=(IAccountDao) BeanFactory.getBean("accountDao");

    public void saveAccount() {
        accountDao.savaAccount();
    }
}
