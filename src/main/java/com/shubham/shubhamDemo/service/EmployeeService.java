package com.shubham.shubhamDemo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.shubham.shubhamDemo.modal.Employee;

public interface EmployeeService {
	int insertEmployee(Employee emp);

	List<Employee> getAllEmployees();
}
