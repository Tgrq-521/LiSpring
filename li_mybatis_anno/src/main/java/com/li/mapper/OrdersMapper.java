package com.li.mapper;

import com.li.domain.Orders;
import com.li.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--24--15:24
 * @date 2020/12/24--15:24
 */
public interface OrdersMapper {
   /* 一对一的第一种查询方式
    @Select("select *,o.id oid from orders o,user u where o.uid=u.id")
    @Results({
          @Result(column ="oid",property ="id"),
          @Result(column = "ordertime",property = "ordertime"),
          @Result(column = "total",property = "total"),
          @Result(column = "uid",property = "user.id"),
          @Result(column = "username",property = "user.username"),
          @Result(column = "password",property = "user.password"),
          @Result(column = "birthday",property = "birthday")
    })
    public List<Orders> findAll();*/

     //一对一的第二种查询方式
    @Select("select * from orders ")
    @Results({
          @Result(column ="oid",property ="id"),
          @Result(column = "ordertime",property = "ordertime"),
          @Result(column = "total",property = "total"),
          @Result(
                  property = "user",//要封装的属性名称
                  column = "uid",//根据哪个字段去查询别的表的数据，此处为user表
                  javaType = User.class,//要封装的实体类型
                  one=@One(select="com.li.mapper.UserMapper.findById")
                     //select属性，代表查询哪个接口的方法获取数据。
                      //   前提：所查询接口的方法已成功实现sql语句。
          )
    })
    public List<Orders> findAll();

    @Select("select * from orders where uid=#{uid}")
    public List<Orders> findByUid(int uid);

}
