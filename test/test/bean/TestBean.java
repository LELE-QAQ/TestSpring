package test.bean;

import com.spring.test_1.Bean1;
import com.spring.test_1.Bean2;
import com.spring.test_1.Bean3;
import com.spring.test_2.ComplexPro;
import com.spring.test_2.User;
import com.spring.test_2.User2;
import com.spring.test_2.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void fun1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        bean1.test();
    }

    @Test
    public void fun2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        bean2.test2();
    }

    @Test
    public void fun3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
        bean3.test3();
    }

    @Test
    public void fun4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        Bean1 bean2 = (Bean1) applicationContext.getBean("bean1");
        System.out.println(bean1);
        System.out.println(bean2);
    }

    @Test
    public void fun5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.print(user);
    }

    @Test
    public void fun6() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        User2 user = (User2) applicationContext.getBean("user2");
        System.out.print(user);
    }

    @Test
    public void fun7()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.testService();

    }
    @Test
    public void fun8()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        ComplexPro complexPro = (ComplexPro) applicationContext.getBean("complexPro");
        complexPro.test();
    }
}
