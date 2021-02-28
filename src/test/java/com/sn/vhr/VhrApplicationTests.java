package com.sn.vhr;

import com.sn.vhr.mapper.MenuMapper;
import com.sn.vhr.model.Menu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VhrApplicationTests {

    @Autowired
    MenuMapper menuMapper;

    @Test
    void contextLoads() {
        List<Menu> menus = menuMapper.getMenusByHrId(10);
        System.out.println(menus.size());
    }

}
