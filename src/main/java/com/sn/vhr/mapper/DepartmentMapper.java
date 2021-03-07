package com.sn.vhr.mapper;

import com.sn.vhr.model.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.access.method.P;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<Department> getAllDepartments();

    List<Department> getAllDepartmentsByParentId(Integer parentId);

    Integer addDepartment(Department department);

    Department getParentDepartment(Integer id);

    Integer updateDepartmentById(Department department);

    Integer deleteDepartmentById(Integer id);

    Integer getChildrenDepartmentCount(Integer parentId);
}