package com.sn.vhr.mapper;

import com.sn.vhr.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmployeeMapper{
    List<Employee> getAllEmployees();
}