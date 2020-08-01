package com.liuweiwei.service.impl;

import java.util.List;

import com.liuweiwei.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuweiwei.bean.Employee;
import com.liuweiwei.mapper.EmployeeMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper ; 
	
	@Override
	public List<Employee> getAllEmps() {
		return employeeMapper.getAllEmps();
	}
}
