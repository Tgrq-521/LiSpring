package com.li.domain;

import java.util.Date;

/**
 * @author LiHui
 * @create 2020--12--18--18:22
 * @date 2020/12/18--18:22
 */
public class Orders {
    private int id;
    private Date ordertime;
    private double total;
    //外键，表示订单属于哪一个用户
            private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", ordertime=" + ordertime +
                ", total=" + total +
                ", user=" + user +
                '}';
    }
}
