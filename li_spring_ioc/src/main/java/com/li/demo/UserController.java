package com.li.demo;

import com.li.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LiHui
 * @create 2020--12--05--16:58
 * @date 2020/12/5--16:58
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceId = (UserService) app.getBean("userServiceId");
        userServiceId.save();
    }
}
