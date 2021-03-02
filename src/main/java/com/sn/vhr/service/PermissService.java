package com.sn.vhr.service;

import com.sn.vhr.mapper.RoleMapper;
import com.sn.vhr.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissService {
    @Autowired
    RoleMapper roleMapper;

    public List<Role> getAllRoles(){
        return roleMapper.getAllRoles();
    }
}
