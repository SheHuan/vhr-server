package com.sn.vhr.service;

import com.sn.vhr.mapper.MenuRoleMapper;
import com.sn.vhr.mapper.RoleMapper;
import com.sn.vhr.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;

    @Autowired
    MenuRoleMapper menuRoleMapper;

    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    public Integer addRole(Role role) {
        if (!role.getName().startsWith("ROLE_")) {
            role.setName("ROLE_" + role.getName());
        }
        return roleMapper.addRole(role);
    }

    @Transactional
    public Integer deleteRoleById(Integer roleId) {
        menuRoleMapper.deleteByRoleId(roleId);
        return roleMapper.deleteRoleById(roleId);
    }
}
