package com.sn.vhr.mapper;

import com.sn.vhr.model.Hr;
import com.sn.vhr.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HrMapper {
    Hr findUserByUsername(String username);

    List<Role> findRolesByUserId(Integer hrId);

    List<Hr> getAllHrs(@Param("id") Integer id, @Param("keyword") String keyword);

    Integer updateHr(Hr hr);

    Integer deleteHrById(Integer hrid);
}