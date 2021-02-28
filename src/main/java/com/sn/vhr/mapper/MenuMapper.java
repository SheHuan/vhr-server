package com.sn.vhr.mapper;

import com.sn.vhr.model.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getMenusByHrId(Integer hrId);

    List<Menu> getAllMenuWithRole();
}