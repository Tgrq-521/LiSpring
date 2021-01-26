package com.li.mapper;

import com.li.domain.Account;

import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--24--22:14
 * @date 2020/12/24--22:14
 */
public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();
}
