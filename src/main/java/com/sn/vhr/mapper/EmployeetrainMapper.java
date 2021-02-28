package com.sn.vhr.mapper;

import com.sn.vhr.model.Employeetrain;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmployeetrainMapper{
    List<Employeetrain> getAllEmployeetrains();
}