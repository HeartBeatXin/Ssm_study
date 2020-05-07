package com.wuxin.dao;

import com.wuxin.damain.Role;

import java.util.List;

/**
 * @author wuxin
 * @create 2020-04-03 14:03
 */
public interface IRoleDao {
    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();
}
