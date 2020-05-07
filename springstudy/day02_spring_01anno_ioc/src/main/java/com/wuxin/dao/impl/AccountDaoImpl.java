package com.wuxin.dao.impl;

import com.wuxin.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * 账户的持久层实现类
 * @author wuxin
 * @create 2020-04-17 14:59
 */
@Repository("accountDao1")
public class AccountDaoImpl implements IAccountDao {
    public void savaAccount(){
        System.out.println("保存了账户111111");

    }
}
