package com.li.dao;

import com.li.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--15--22:25
 * @date 2020/12/15--22:25
 */
public interface UserMapper {
    public List<User> findAll() ;
    public User findById(int id);
}
