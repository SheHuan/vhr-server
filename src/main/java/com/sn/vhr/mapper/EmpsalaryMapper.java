package com.sn.vhr.mapper;

import com.sn.vhr.model.Empsalary;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface EmpsalaryMapper{
    List<Empsalary> getAllEmpsalarys();
}