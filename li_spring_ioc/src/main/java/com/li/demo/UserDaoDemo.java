package com.li.demo;

import com.li.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LiHui
 * @create 2020--11--30--20:16
 * @date 2020/11/30--20:16
 */
public class UserDaoDemo {
    public static void main(String[] args){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDaoId = (UserDao)app.getBean("userDaoId");
        userDaoId.save();
    }
}
