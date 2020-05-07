package com.wuxin.dao;

import com.wuxin.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author wuxin
 * @create 2020-04-05 15:06
 * 在mybatis中针对crud一共四个注解: @Select @Insert @Update @Delete
 *
 */
public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    @Results( id="userMap",value={
            @Result(id=true,column = "id",property = "userId"),
            @Result(column = "username",property = "userName"),
            @Result(column = "address",property = "userAddress"),
            @Result(column = "sex",property = "userSex"),
            @Result(column = "birthday",property = "userBirthday"),
            @Result(property = "accounts",column = "id",many = @Many(select="com.wuxin.dao.IAccountDao.findAccountByUid",fetchType= FetchType.LAZY))
    })
    List<User> findAll();


     /**
      * 根据id 查询用户
     * @param userId
     * @return
     */
    @Select("select * from user where id=#{id}")
    @ResultMap("userMap")
    User findById(Integer userId);

    /**
     * 根据用户名称模糊查询
     *
     * @param username
     * @return
     */
    @Select("select * from user where username like #{username} ")
    @ResultMap("userMap")
//    @Select("select * from user where username like '%${value}%' ")
    List<User> findUserByName(String username);


}
