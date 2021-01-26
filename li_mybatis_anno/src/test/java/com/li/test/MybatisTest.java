package com.li.test;

import com.li.domain.User;
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
public class MybatisTest {
    private UserMapper mapper;
    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testSave(){
        User user=new User();
        user.setUsername("tom");
        user.setPassword("123");
        mapper.save(user);
    }

    @Test
    public void testUpdate(){
        User user=new User();
        user.setId(5);
        user.setUsername("tomm");
        user.setPassword("123");
        mapper.update(user);
    }

    @Test
    public void testDelete(){
        mapper.delete(5);
    }


    @Test
    public void testSelectOne(){
        User user = mapper.findById(1);
        System.out.println(user);
    }

    @Test
    public void testSelectAll(){
        List<User> userList = mapper.findAll();
        System.out.println(userList);
    }
}
