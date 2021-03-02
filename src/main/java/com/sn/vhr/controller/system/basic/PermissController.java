package com.sn.vhr.controller.system.basic;

import com.sn.vhr.model.Menu;
import com.sn.vhr.model.Role;
import com.sn.vhr.service.MenuService;
import com.sn.vhr.service.PermissService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/permiss")
public class PermissController {
    @Autowired
    PermissService permissService;

    @Autowired
    MenuService menuService;

    @GetMapping("/")
    public List<Role> getAllRoles() {
        return permissService.getAllRoles();
    }

    @GetMapping("/menus")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }
}
