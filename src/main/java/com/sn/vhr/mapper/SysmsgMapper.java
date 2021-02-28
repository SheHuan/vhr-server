package com.sn.vhr.mapper;

import com.sn.vhr.model.Sysmsg;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SysmsgMapper{
    List<Sysmsg> getAllSysmsgs();
}