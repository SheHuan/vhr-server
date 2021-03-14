package com.sn.vhr.service;

import com.sn.vhr.mapper.EmployeeMapper;
import com.sn.vhr.model.Employee;
import com.sn.vhr.model.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");

    /**
     * 计算合同期限
     *
     * @param employee
     */
    public void calculateContractTerm(Employee employee) {
        Date beginContract = employee.getBeginContract();
        Date endContract = employee.getEndContract();
        double month = (Double.parseDouble(yearFormat.format(endContract)) - Double.parseDouble(yearFormat.format(beginContract))) * 12
                + Double.parseDouble(monthFormat.format(endContract)) - Double.parseDouble(monthFormat.format(beginContract));

        employee.setContractTerm(Double.parseDouble(decimalFormat.format(month / 12)));
    }

    public RespPageBean getEmployeeByPage(Integer pageNum, Integer pageSize, String keyword) {
        Integer offset = (pageNum - 1) * pageSize;
        List<Employee> data = employeeMapper.getEmployeeByPage(offset, pageSize, keyword);
        Long total = employeeMapper.getTotal(keyword);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(data);
        respPageBean.setTotal(total);
        return respPageBean;
    }

    public Integer addEmployee(Employee employee) {
        calculateContractTerm(employee);
        return employeeMapper.addEmployee(employee);
    }

    public Integer getMaxWorkID() {
        return employeeMapper.getMaxWorkID();
    }

    public Integer deleteEmployee(Integer id) {
        return employeeMapper.deleteEmployee(id);
    }

    public Integer updateEmployee(Employee employee) {
        calculateContractTerm(employee);
        return employeeMapper.updateEmployee(employee);
    }
}
