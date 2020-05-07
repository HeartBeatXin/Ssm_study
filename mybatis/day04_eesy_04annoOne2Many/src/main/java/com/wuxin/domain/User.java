package com.wuxin.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * @author wuxin
 * @create 2020-04-05 14:54
 */
public class User implements Serializable {
    private Integer UserId;
    private String userName;
    private String userAddress;
    private String UserSex;
    private Date userBirthday;
    //一对多关系映射：一个用户对应多个账户
    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserSex() {
        return UserSex;
    }

    public void setUserSex(String userSex) {
        UserSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", UserSex='" + UserSex + '\'' +
                ", userBirthday=" + userBirthday +
                '}';
    }
}
