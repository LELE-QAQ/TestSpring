package com.spring.test_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("userService")
public class UserService {
    @Autowired
    private  UserDao userDao;
    public void testService()
    {
        userDao.testDao();
        System.out.println("userService....");
    }
}
