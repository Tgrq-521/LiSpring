package com.li.mapper;

import com.li.domain.User;

import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--15--23:41
 * @date 2020/12/15--23:41
 */
public interface UserMapper {
    public List<User> findByCondition(User user);
    public List<User> findByIds(List<Integer> ids);
    public List<User> findAll();
}
