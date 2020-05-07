package com.wuxin.test;

import com.wuxin.domain.Account;
import com.wuxin.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用Junit单元测试，测试我们的配置
 *
 * @author wuxin
 * @create 2020-04-24 18:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:bean.xml")
public class AccountServiceTest {
    @Autowired
    private IAccountService as;

    @Test
    public void testFindAll() {

        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {

        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("test");
        account.setMoney(12345f);

        as.saveAccount(account);

    }

    @Test
    public void testUpdate() {

        Account account = as.findAccountById(4);
        account.setMoney(23456f);
        as.updateAccount(account);

    }

    @Test
    public void testDetele() {

        as.deleteAccount(4);

    }
}
