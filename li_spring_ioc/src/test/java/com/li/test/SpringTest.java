package com.li.test;

import com.li.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LiHui
 * @create 2020--11--30--21:17
 * @date 2020/11/30--21:17
 */
public class SpringTest {

    @Test
    //测试scope属性
    public void test1(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDaoId1 = (UserDao)app.getBean("userDaoId");
        UserDao userDaoId2 =(UserDao)app.getBean("userDaoId");
        System.out.println(userDaoId1);
        System.out.println(userDaoId2);
    }
}

