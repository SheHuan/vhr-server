package com.sn.vhr.mapper;

import com.sn.vhr.model.Adjustsalary;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AdjustsalaryMapper{
    List<Adjustsalary> getAllAdjustsalarys();
}