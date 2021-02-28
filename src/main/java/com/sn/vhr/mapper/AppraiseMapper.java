package com.sn.vhr.mapper;

import com.sn.vhr.model.Appraise;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AppraiseMapper{
    List<Appraise> getAllAppraises();
}