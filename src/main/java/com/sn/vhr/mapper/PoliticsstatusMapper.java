package com.sn.vhr.mapper;

import com.sn.vhr.model.Politicsstatus;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PoliticsstatusMapper{
    List<Politicsstatus> getAllPoliticsstatuss();

    Politicsstatus getPoliticsstatusById(Integer id);
}