package com.li.mapper;

import com.li.domain.Role;
import com.li.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--20--0:18
 * @date 2020/12/20--0:18
 */
public interface UserMapper {
    @Insert("insert into user values(#{id},#{username},#{password},#{birthday})")
    public void save(User user);
    @Update("update user set username=#{username},password=#{password} where id=#{id}")
    public void  update(User user);
    @Delete("delete from user where id=#{id}")
    public void delete(int id);
    @Select("select * from user where id=#{id}")
    public  User findById(int id);
    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user")
    @Results({
            @Result(id = true,column = "id",property = "id"),/*id = true,表示该属性为主键*/
            @Result(column = "username",property = "username"),
            @Result(column = "password",property = "password"),
            @Result(
                    property = "ordersList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "com.li.mapper.OrdersMapper.findByUid")
            )

    })
    public List<User> findUserAndOrderAll();

    @Select("select * from user")
    @Results({
        @Result(id = true,column = "id",property = "id"),
        @Result(column = "username",property = "username"),
        @Result(column = "password",property = "password"),
        @Result(
                property = "roleList",
                column = "id",
                javaType = List.class,
                many = @Many(select = "com.li.mapper.RoleMapper.findByUid")
        )
    })
    public List<User> findUserAndRoleAll();
}
