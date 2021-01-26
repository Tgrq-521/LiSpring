package com.li.mapper;

import com.li.domain.Orders;

import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--18--18:30
 * @date 2020/12/18--18:30
 */
public interface OrdersMapper {
    public List<Orders> findAll();
}
