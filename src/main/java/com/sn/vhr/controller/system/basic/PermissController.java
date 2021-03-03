package com.sn.vhr.controller.system.basic;

import com.sn.vhr.model.Menu;
import com.sn.vhr.model.RespBean;
import com.sn.vhr.model.Role;
import com.sn.vhr.service.MenuService;
import com.sn.vhr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/permiss")
public class PermissController {
    @Autowired
    RoleService roleService;

    @Autowired
    MenuService menuService;

    @GetMapping("/")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/menus")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("mids/{roleId}")
    public List<Integer> getMenuIdsByRoleId(@PathVariable Integer roleId) {
        return menuService.getMenuIdsByRoleId(roleId);
    }

    @PutMapping("/")
    public RespBean updateMenuRole(Integer roleId, Integer[] menuIds){
        if (menuService.updateMenuRole(roleId, menuIds)){
            return RespBean.ok("更新成功！");
        }
        return RespBean.ok("更新失败！");
    }
}
