package com.sn.vhr.mapper;

import com.sn.vhr.model.Department;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface DepartmentMapper{
    List<Department> getAllDepartments();

    List<Department> getAllDepartmentsByParentId(Integer parentId);
}