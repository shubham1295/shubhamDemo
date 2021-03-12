package com.shubham.shubhamDemo.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shubham.shubhamDemo.modal.Employee;

@Service
public interface EmployeeDao {
	int insertEmployee(Employee cus);

	List<Employee> getAllEmployees();
}
