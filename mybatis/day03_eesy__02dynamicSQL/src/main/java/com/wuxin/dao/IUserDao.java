package com.wuxin.dao;

import com.wuxin.damain.QueryVo;
import com.wuxin.damain.User;

import java.util.List;

/**
 * @author wuxin
 * @create 2020-03-30-12:19
 * 用户的持久层接口
 */
public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();


    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 根据名称模糊查询用户信息
     * @param username
     * @return
     */
    List<User> findByName(String username);


    /**
     * 根据queryVo中的条件查询用户
     * @param vo
     * @return
     */
    List<User> findUserByVo(QueryVo vo);

    /**
     * 根据传入参数条件
     * @param user 查询的条件，有可能有用户名，有可能有性别，有地址，可能都有，或者没有
     * @return
     */
    List<User> findUserByCondtion(User user);

    /**
     * 根据query vo提供的id集合，查询用户信息
     * @param vo
     * @return
     */
    List<User> findUserInIds(QueryVo vo);
}
