package com.li.domain;

import javax.management.relation.Role;
import java.util.Date;
import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--20--0:18
 * @date 2020/12/20--0:18
 */
public class User {
    private int id;
    private String username;
    private String password;
    private Date birthday;
    //当前用户存在哪些订单
    private List<Orders> ordersList;

    //当前用户具备哪些角色
    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", ordersList=" + ordersList +
                ", roleList=" + roleList +
                '}';
    }
}
