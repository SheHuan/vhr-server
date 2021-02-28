package com.sn.vhr.mapper;

import com.sn.vhr.model.Joblevel;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface JoblevelMapper{
    List<Joblevel> getAllJoblevels();
}