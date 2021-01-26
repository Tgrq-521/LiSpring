package com.li.service;

import com.li.domain.Account;

import java.io.IOException;
import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--24--22:15
 * @date 2020/12/24--22:15
 */
public interface AccountService {
    public void save(Account account) throws IOException;

    public List<Account> findAll() throws IOException;
}
