package com.iamyasas.springbootbasicauthdemo.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.iamyasas.springbootbasicauthdemo.models.Employee;

@Mapper
public interface EmployeeMapper {
	
	public Employee[] getEmployees(@Param("name") String name);
	
	public Employee getEmployee(@Param("employeeID") int employeeID);
	
}
