package com.sn.vhr.mapper;

import com.sn.vhr.model.Employeeremove;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmployeeremoveMapper{
    List<Employeeremove> getAllEmployeeremoves();
}