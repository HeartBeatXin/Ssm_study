package com.wuxin.service;

/**
 * 账户的业务层接口
 * @author wuxin
 * @create 2020-05-04 9:15
 */
public interface IAccountService {
    /**
     * 模拟保存账户
     */
    void saveAccount();

    /**
     * 模拟更新账户
     */
    void updateAccount(int i);

    /**
     * 删除账户
     * @return
     */
    int deleteAccount();
}
