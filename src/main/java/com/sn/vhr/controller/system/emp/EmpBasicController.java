package com.sn.vhr.controller.system.emp;

import com.sn.vhr.model.RespPageBean;
import com.sn.vhr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp/basic")
public class EmpBasicController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public RespPageBean getEmployeeByPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                          @RequestParam(defaultValue = "10") Integer pageSize,
                                          String keyword) {
        return employeeService.getEmployeeByPage(pageNum, pageSize, keyword);
    }
}
