package com.wuxin.service.impl;

import com.wuxin.dao.IAccountDao;
import com.wuxin.dao.impl.AccountDaoImpl;
import com.wuxin.service.IAccountService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 账户业务层实现类
 * 曾经的xml配置
 *     <bean id="accountService" class="com.wuxin.service.impl.AccountServiceImpl"
 *     scope="" init-method="" destroy-method="">
 *     <propty name="" value=""></propty>
 *     </bean>
 *     用于创建对象的注解 :
 *              他们的作用就和在xml配置文件中编写一个<bean>实现的功能是一样的
 *  component:用于把当前类对象存入spring容器中
 *             属性：value：用于指定bean的id。当我们不写时，他的默认值是当前类名，且首字母改小写
 *   Controller:一般用于表现层
 *   Service:一般用于业务层
 *   Repository：一般用于持久层
 *   以上三个注解他们的作用和属性与Component是一摸一样.
 *   他们三个是spring框架为我们提供明确的三层使用的注解，使我们的三层对象更加清晰
 *     用于注入数据的注解：
 *     Autowired:
 *     作用：自动按照类型注入。只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可以注入成功
 *     如果ioc容器中没有任何bean的类型和要注入的类型匹配，则报错。
 *     如果ioc中有多个类型匹配时，报错
 *     出现位置：可以是变量上，也可以是方法上。
 *     细节：使用注解注入时，set方法不是必须的
 *     Qualifier:
 *     作用：在按照类型中注入的基础之上，再按照名称注入。它在给类成员注入时，不能单独使用，但是给方法参数注入时，可以
 *     属性：
 *         value：用于指定注入bean的id。
 *     Resource
 *       作用：直接按bean的id注入，它可以独立使用
 *       属性：
 *       name：用于指定bean的id
 *       以上三个注解只能注入其他数据类型，而基本数据类和String 类型无法使用上述注解实现
 *       另外，集合类型的注入只能通过xml来实现
 *       Value：
 *       作用：用于注入基本类型和string类型的数据
 *       属性：value：用于指定数据的值，它可以使用spring中的SpEl（也就是spring中的EL表达式）
 *             SpEl的写法：${表达式}
 *
 *              他们的作用就和在xml配置文件中的bean标签中写一个<property>的作用是一样的
 *     用于改变作用范围的注解：他们的作用就在和bean标签中使用scope属性实现的的功能是一样的
 *     Scope：作用：用于指定bean的作用范围
 *            属性：value：指定范围的取值：singleton prototype
 *     和生命周期相关的注解：（了解）
 *     他们的作用就在和bean标签中使用init-method和destroy-method的作用是一样的
 *     ProDestroy:用于指定销毁方法
 *     PostConstruct:用于指定初始化方法
 * @author wuxin
 * @create 2020-04-17 14:53
 */
@Component
public class AccountServiceImpl implements IAccountService{
    //    @Autowired
//    @Qualifier("accountDao1")
    @Resource(name="accountDao2")
    private IAccountDao accountDao = new AccountDaoImpl();
    public void saveAccount() {
        accountDao.savaAccount();
    }
}
