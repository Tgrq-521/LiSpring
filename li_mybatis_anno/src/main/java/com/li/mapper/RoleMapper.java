package com.li.mapper;

import com.li.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author LiHui
 * @create 2020--12--24--21:38
 * @date 2020/12/24--21:38
 */
public interface RoleMapper {

    @Select("select * from sys_user_role ur,sys_role r where ur.roleId=r.id and ur.userId=#{uid}")
    public List<Role>  findByUid(int id);
}
