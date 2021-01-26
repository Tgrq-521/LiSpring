package com.li.test;


import com.li.domain.Orders;
import com.li.domain.User;
import com.li.mapper.OrdersMapper;
import com.li.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
     * @author LiHui
     * @create 2020--12--15--23:52
     * @date 2020/12/15--23:52
     */
    public class MybatisTest {
        @Test
        public void test1() throws IOException {


            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            //org.apache.ibatis.io.Resources;
            //获得session工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获得session回话对象
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
            List<Orders> orders = mapper.findAll();
            for (Orders order : orders) {
                System.out.println(order);
            }



        }

    @Test
    public void test2() throws IOException {


        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }


    }
    @Test
    public void test3() throws IOException {


        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findUserAndRoleAll();
        for (User user : userList) {
            System.out.println(user);
        }


    }



}
