package test.bean;

import com.spring.test_3.User;
import com.spring.test_3.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean2 {
    @Test
    public void fun1()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config_2.xml");
        User user = (User) applicationContext.getBean("user");
        user.test();
        user.testUsername();
    }
    @Test
    public void fun2()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config_2.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.testService();
    }
}
