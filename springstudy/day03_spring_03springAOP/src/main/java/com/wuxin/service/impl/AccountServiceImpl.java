package com.wuxin.service.impl;

import com.wuxin.service.IAccountService;

/**
 * 账户的业务层实现类
 *
 * @author wuxin
 * @create 2020-05-04 9:20
 */
public class AccountServiceImpl implements IAccountService {
    public void saveAccount() {
        System.out.println("执行了保存");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新"+i);

    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
