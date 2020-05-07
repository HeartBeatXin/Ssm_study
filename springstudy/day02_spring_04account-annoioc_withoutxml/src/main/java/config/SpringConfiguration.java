package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * 该类是一个配置类，它的作用和bean.xml是一样的
 * Spring中的新注解
 * Configuration：
 *       作用：指定当前类是一个配置类
 *       细节：当配置类作为AnnotationConfigApplicationContext对象创建的参数时，该参数可以不写。
 * ComponentScan:
 *       作用:用于通过注解指定spring在创建容器时要扫描的包
 *       属性：
 *           value：它和basePackages的作用是一样的，都是用于创建容器时要扫描的包
 *                  我们使用此注解就等同于在xml中配置了：    <context:component-scan base-package="com.wuxin"></context:component-scan>
 *  Bean:
 *       作用：用于把当前方法的返回值作为bean队象存入spring的ioc的容器中
 *       属性：
 *           name:用于指定bean的id。当不写时，默认值是当前方法的名称
 *       细节：
 *           当我们使用注解配置方法时，如果方法有参数，spring框架会去容器中查找有没有可用的bean对象
 *           查找的方式和Autowired的作用是一样的，
 *  Import:
 *      作用：用于导入其他的配置类
 *      属性：
 *          value：用于指定其他配置类的字节码。
 *                  当我们使用Import的注解之后，有Import的类就是父配置类，而导入的都是子配置类
 *  PropertySource
 *  作用：用于指定properties文件的位置
 *  属性：value:指定文件的名称和路径
 *       关键字：classpath.表示类路径下
 *
 *
 *
 * @author wuxin
 * @create 2020-04-28 8:34
 */
@Configuration
@ComponentScan("com.wuxin")
//@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    /**
     * 用于创建一个QueryRunner对象
     * @param dataSource
     * @return
     */
    @Bean(name="Runner")
    @Scope("prototype")
    public QueryRunner creatQueryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    /**
     * 创建数据源对象
     * @return
     */
    @Bean(name="dataSource")
    public DataSource createDataSource() {
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass(driver);
            ds.setJdbcUrl(url);
            ds.setUser(username);
            ds.setPassword(password);
            return ds;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
