package com.li.service.impl;

import com.li.domain.Account;
import com.li.mapper.AccountMapper;
import com.li.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--24--22:17
 * @date 2020/12/24--22:17
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private  AccountMapper accountMapper;
    public void save(Account account) throws IOException {
        accountMapper.save(account);
        /*InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        mapper.save(account);*/


    }

    public List<Account> findAll() {

        List<Account> accountList = accountMapper.findAll();
        return accountList;
        /*try {
            InputStream resourceAsStream= Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession=sqlSessionFactory.openSession(true);
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> accountList = mapper.findAll();
            return accountList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    */
    }
}
