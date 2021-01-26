package com.li.mapper;

import com.li.domain.User;

import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--18--18:19
 * @date 2020/12/18--18:19
 */
public interface UserMapper {
    public List<User> findAll();
    public List<User> findUserAndRoleAll();
}
