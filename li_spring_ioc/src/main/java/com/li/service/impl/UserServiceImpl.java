package com.li.service.impl;

import com.li.dao.UserDao;
import com.li.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--05--16:27
 * @date 2020/12/5--16:27
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public UserServiceImpl(){

    }
     List list;
    public UserServiceImpl(List list){
        this.list=list;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        System.out.println(list);
        userDao.save();
    }
}
