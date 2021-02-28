package com.sn.vhr.service;

import com.sn.vhr.mapper.MenuMapper;
import com.sn.vhr.model.Hr;
import com.sn.vhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    /**
     * 查询当前用户可以访问的菜单
     * @return
     */
    public List<Menu> getMenusByHrId() {
        Hr hr = (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return menuMapper.getMenusByHrId(hr.getId());
    }


//    @Cacheable redis缓存
    public List<Menu> getAllMenuWithRole(){
        return menuMapper.getAllMenuWithRole();
    }
}
