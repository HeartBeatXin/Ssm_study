package com.wuxin.dao;

import com.wuxin.damain.User;

import java.util.List;

/**
 * @author wuxin
 * @create 2020-03-30-12:19
 * 用户的持久层接口
 */
public interface IUserDao {
    /**
     * 查询所有用户,同时获取到所有账户的信息
     * @return
     */
    List<User> findAll();


    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);


}
