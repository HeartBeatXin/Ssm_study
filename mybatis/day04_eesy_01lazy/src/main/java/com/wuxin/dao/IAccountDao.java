package com.wuxin.dao;

import com.wuxin.damain.Account;

import java.util.List;

/**
 * @author wuxin
 * @create 2020-04-03 9:39
 */
public interface IAccountDao {
    /**
     * 查询所有账户,同时还要获取到当前账户的所属用户信息
     *
     * @return
     */
    List<Account> findAll();

    /**
     * 根据用户id查询账户信息
     * @param uid
     * @return
     */
    List<Account> findAccountByUid(Integer uid);

}
