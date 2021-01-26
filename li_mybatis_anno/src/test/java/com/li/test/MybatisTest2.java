package com.li.test;

import com.li.domain.Orders;
import com.li.domain.User;
import com.li.mapper.OrdersMapper;
import com.li.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--20--0:26
 * @date 2020/12/20--0:26
 */
public class MybatisTest2 {
    private OrdersMapper mapper;
    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(OrdersMapper.class);
    }

    @Test
    public void testSave(){
        List<Orders> ordersList = mapper.findAll();
        for (Orders orders : ordersList) {
            System.out.println(orders);
        }
    }


}
