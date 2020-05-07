package com.wuxin.domain;

import java.io.Serializable;

/**
 * 账户的实体类
 * @author wuxin
 * @create 2020-05-04 15:43
 */
public class Account  implements Serializable {
    private Integer id;
    private String   name;
    private Float money;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public void setId(Integer id) {
        this.id = id;
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
