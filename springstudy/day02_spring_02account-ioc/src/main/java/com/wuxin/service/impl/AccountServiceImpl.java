package com.wuxin.service.impl;

import com.wuxin.dao.IAccountDao;
import com.wuxin.domain.Account;
import com.wuxin.service.IAccountService;

import java.util.List;

/**
 * 账户的业务层实现类
 * @author wuxin
 * @create 2020-04-24 17:16
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
      accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);

    }

    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
