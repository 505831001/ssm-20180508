package com.liuweiwei.handler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.liuweiwei.bean.Employee;
import com.liuweiwei.service.EmployeeService;

@Controller
public class EmployeeHandler {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/emps", method = RequestMethod.GET)
    public String listAllEmps(Map<String, Object> map) {
        List<Employee> emps = employeeService.getAllEmps();
        map.put("emps", emps);
        return "list";
    }
}
