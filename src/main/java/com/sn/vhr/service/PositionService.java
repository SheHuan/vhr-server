package com.sn.vhr.service;

import com.sn.vhr.mapper.PositionMapper;
import com.sn.vhr.model.Position;
import com.sn.vhr.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;

    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }

    public Integer addPosition(Position position) {
        position.setEnabled(true);
        position.setCreateDate(new Date());
        return positionMapper.addPosition(position);
    }

    public Integer updatePosition(Position position) {
        return positionMapper.updatePosition(position);
    }

    public Integer deletePosition(Integer id){
        return positionMapper.deletePosition(id);
    }
}
