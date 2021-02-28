package com.sn.vhr.mapper;

import com.sn.vhr.model.MenuRole;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MenuRoleMapper{
    List<MenuRole> getAllMenuRoles();
}