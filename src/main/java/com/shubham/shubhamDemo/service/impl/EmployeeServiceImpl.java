package com.shubham.shubhamDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.shubhamDemo.dao.EmployeeDao;
import com.shubham.shubhamDemo.modal.Employee;
import com.shubham.shubhamDemo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public int insertEmployee(Employee emp) {
		return employeeDao.insertEmployee(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

}
