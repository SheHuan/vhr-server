package com.sn.vhr.mapper;

import com.sn.vhr.model.Msgcontent;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MsgcontentMapper{
    List<Msgcontent> getAllMsgcontents();
}