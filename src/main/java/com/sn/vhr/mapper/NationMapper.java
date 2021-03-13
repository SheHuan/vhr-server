package com.sn.vhr.mapper;

import com.sn.vhr.model.Nation;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface NationMapper{
    List<Nation> getAllNations();

    Nation getNationById(Integer id);
}