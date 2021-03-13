package com.sn.vhr.mapper;

import com.sn.vhr.model.JobLevel;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface JobLevelMapper {
    List<JobLevel> getAllJobLevels();

    JobLevel getJobLevelById(Integer id);
}