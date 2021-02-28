package com.sn.vhr.mapper;

import com.sn.vhr.model.Salary;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SalaryMapper{
    List<Salary> getAllSalarys();
}