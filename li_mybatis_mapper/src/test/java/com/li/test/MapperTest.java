package com.li.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.li.domain.User;
import com.li.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--15--23:52
 * @date 2020/12/15--23:52
 */
public class MapperTest {
    @Test
    public void test1() throws IOException {


            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            //org.apache.ibatis.io.Resources;
            //获得session工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获得session回话对象
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            //模拟条件user
              User user=new User();
              user.setId(1);
              user.setUsername("lihui");
           //   user.setPassword("123");
        List<User> users = mapper.findByCondition(user);
        System.out.println(users);


    }

    @Test
    public void test2() throws IOException {


        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //模拟ids的数据
        List<Integer> ids=new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<User> u = mapper.findByIds(ids);
        System.out.println(u);


    }

    @Test
    public void test3() throws IOException {


        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //org.apache.ibatis.io.Resources;
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //模拟ids的数据

        //设置分页的相关参数   当前页+每页显示的行数。
        PageHelper.startPage(2,3);//第一个参数,第几页；第二个参数，一页显示几个

        List<User> userList = mapper.findAll();
        for (User user : userList) {
            System.out.println("user = " + user);
        }

        /*获取与分页相关参数*/
        PageInfo<User> pageInfo=new PageInfo<User>(userList);
        System.out.println("当前页："+pageInfo.getPageNum());
        System.out.println("每页显示条数"+pageInfo.getPageSize());
        System.out.println("总条数"+pageInfo.getTotal());
        System.out.println("总页数："+pageInfo.getPages());
        System.out.println("上一页："+pageInfo.getPrePage());
        System.out.println("下一页："+pageInfo.getNextPage());
        System.out.println("是否是第一页："+pageInfo.isIsFirstPage());
        System.out.println("第一页是："+pageInfo.getFirstPage());
        System.out.println("是否是最后一页："+pageInfo.isIsLastPage());
        System.out.println("最后一页是："+pageInfo.getLastPage());

    }
}
