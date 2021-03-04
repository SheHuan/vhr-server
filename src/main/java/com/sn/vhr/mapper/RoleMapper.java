package com.sn.vhr.mapper;

import com.sn.vhr.model.Role;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface RoleMapper{
    List<Role> getAllRoles();

    Integer addRole(Role role);
}