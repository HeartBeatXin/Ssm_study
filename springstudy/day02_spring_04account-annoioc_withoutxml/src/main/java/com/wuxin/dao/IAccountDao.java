package com.wuxin.dao;

import com.wuxin.domain.Account;

import java.util.List;

/**
 * 账户的持久层接口
 * @author wuxin
 * @create 2020-04-24 17:19
 */
public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存操作
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     *
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     * @param accountId
     */
    void deleteAccount (Integer accountId);
}
