package com.wuxin.dao;

import com.wuxin.domain.User;
import com.wuxin.mybatis.annotation.Select;

import java.util.List;

/**
 * @author wuxin
 * @create 2020-03-23-7:19
 * <p>
 * 用户的持久层接口
 */
public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
    @Select("select* from user")
    List<User> findAll();


}
