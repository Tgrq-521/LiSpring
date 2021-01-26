package com.li.factory;

import com.li.dao.UserDao;
import com.li.dao.impl.UserDaoImpl;

/**
 * @author LiHui
 * @create 2020--12--03--14:17
 * @date 2020/12/3--14:17
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
