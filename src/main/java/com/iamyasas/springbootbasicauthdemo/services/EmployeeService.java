package com.iamyasas.springbootbasicauthdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamyasas.springbootbasicauthdemo.mappers.EmployeeMapper;
import com.iamyasas.springbootbasicauthdemo.models.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeMapper mapper;
	
	public Employee[] getEmployees(String name) {
		return mapper.getEmployees(name);
	}

	public Employee getEmployee(int employeeID) {
		return mapper.getEmployee(employeeID);
	}

}
