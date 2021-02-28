package com.sn.vhr.mapper;

import com.sn.vhr.model.Position;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PositionMapper {
    List<Position> getAllPositions();

    int addPosition(Position position);

    int updatePosition(Position position);

    Integer deletePosition(Integer id);
}