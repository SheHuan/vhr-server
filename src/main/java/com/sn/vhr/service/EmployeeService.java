package com.sn.vhr.service;

import com.sn.vhr.mapper.EmployeeMapper;
import com.sn.vhr.model.Employee;
import com.sn.vhr.model.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public RespPageBean getEmployeeByPage(Integer pageNum, Integer pageSize, String keyword) {
        Integer offset = (pageNum - 1) * pageSize;
        List<Employee> data = employeeMapper.getEmployeeByPage(offset, pageSize, keyword);
        Long total = employeeMapper.getTotal(keyword);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(data);
        respPageBean.setTotal(total);
        return respPageBean;
    }
}
