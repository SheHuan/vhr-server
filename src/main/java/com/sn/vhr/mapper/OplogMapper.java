package com.sn.vhr.mapper;

import com.sn.vhr.model.Oplog;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface OplogMapper{
    List<Oplog> getAllOplogs();
}