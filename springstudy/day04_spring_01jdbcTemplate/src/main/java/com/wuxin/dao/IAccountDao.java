package com.wuxin.dao;

import com.wuxin.domain.Account;

/**
 * 账户的持久层接口
 * @author wuxin
 * @create 2020-05-05 11:24
 */
public interface IAccountDao {
    /**
     * 根据id查询账户
     * @param account
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 根据名称查询账户
     * @param accountName
     * @return
     */
    Account findAccountByName(String accountName);

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);
}
