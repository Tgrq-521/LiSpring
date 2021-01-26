package com.li.test;

import com.li.domain.User;
import org.apache.ibatis.cursor.Cursor;
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
 * @create 2020--12--15--15:46
 * @date 2020/12/15--15:46
 */
public class MybatisTest {
    @Test
    public  void test1() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数：namespace+id
        List<User> userList = sqlSession.selectList("userMapper.findAll");
        System.out.println(userList);
        sqlSession.close();
    }

    @Test
    public  void test2() throws IOException {

        User user=new User();

        user.setUsername("liyuli");
        user.setPassword("123");
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //执行操作  参数：namespace+id
        int i = sqlSession.insert("userMapper.save", user);

     //   sqlSession.commit();
        System.out.println(i);
        sqlSession.close();
    }

    @Test
    public  void test3() throws IOException {

        User user=new User();
        user.setId(6);
        user.setUsername("liu");
        user.setPassword("123");
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //执行操作  参数：namespace+id
        int i = sqlSession.update("userMapper.update",user);

        //   sqlSession.commit();
        System.out.println(i);
        sqlSession.close();
    }

    @Test
    public  void test4() throws IOException {


        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //执行操作  参数：namespace+id
        int i = sqlSession.delete("userMapper.delete",6);

        //   sqlSession.commit();
        System.out.println(i);
        sqlSession.close();
    }
    @Test
    public  void test5() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数：namespace+id

        User user = sqlSession.selectOne("userMapper.findOne", 7);
        System.out.println(user);
        sqlSession.close();
    }
}
