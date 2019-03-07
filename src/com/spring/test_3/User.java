package com.spring.test_3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "user") //value可省略
/*
    @Service("user")
    @Controller("user")
    @Repository("user")
*/
public class User {
    @Value("李四")
    private String username;
    public void test() {
        System.out.println("注解创建对象....");
    }
    public void testUsername()
    {
        System.out.print("username="+username);
    }
}
