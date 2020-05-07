package com.wuxin.domain;

import java.io.Serializable;

/**
 * 账户的实体类
 *
 * @author wuxin
 * @create 2020-04-24 17:05
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
    private  float money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
