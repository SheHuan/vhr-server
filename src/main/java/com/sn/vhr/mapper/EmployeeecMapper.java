package com.sn.vhr.mapper;

import com.sn.vhr.model.Employeeec;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmployeeecMapper{
    List<Employeeec> getAllEmployeeecs();
}