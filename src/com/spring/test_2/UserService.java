package com.spring.test_2;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void testService() {
        userDao.testDao();
        System.out.println("UserService...");
    }
}
