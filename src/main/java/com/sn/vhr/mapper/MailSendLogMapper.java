package com.sn.vhr.mapper;

import com.sn.vhr.model.MailSendLog;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MailSendLogMapper{
    List<MailSendLog> getAllMailSendLogs();
}