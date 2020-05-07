package com.wuxin.dao.impl;

import com.wuxin.damain.User;
import com.wuxin.dao.IUserDao;

import java.util.List;

/**
 * @author wuxin
 * @create 2020-03-31-15:19
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void savaUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public User findById(Integer userId) {
        return null;
    }

    @Override
    public List<User> findByName(String username) {
        return null;
    }

    @Override
    public int findTotal() {
        return 0;
    }
}
