package com.sn.vhr.mapper;

import com.sn.vhr.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> getAllEmployees();

    Integer getEmployeeCountByDepartmentId(Integer departmentId);

    List<Employee> getEmployeeByPage(@Param("offset") Integer offset, @Param("pageSize") Integer pageSize, @Param("keyword") String keyword);

    Long getTotal(String keyword);

    Integer addEmployee(Employee employee);

    Integer getMaxWorkID();

    Integer deleteEmployee(Integer id);

    Integer updateEmployee(Employee employee);
}