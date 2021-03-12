package com.shubham.shubhamDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.When;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.shubham.shubhamDemo.dao.EmployeeDao;
import com.shubham.shubhamDemo.modal.Employee;
import com.shubham.shubhamDemo.service.EmployeeService;

@SpringBootTest
class ShubhamDemoApplicationTests {
	
	@Autowired
	EmployeeService employeeService;
	
	@MockBean
	EmployeeDao employeeDao;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testGetEmpoyee() {
		List<Employee> empList = new ArrayList<>();
		Employee emp = new Employee();
		emp.setEmpId("1");
		emp.setEmpName("Shubham");
		empList.add(emp);
		Mockito.when(employeeDao.getAllEmployees()).thenReturn(empList);
		
		assertEquals(empList, employeeService.getAllEmployees());
		
	}
	
	@Test
	void testAddEmpoyee() {
		Employee emp = new Employee();
		emp.setEmpId("1");
		emp.setEmpName("Shubham");
		Mockito.when(employeeDao.insertEmployee(emp)).thenReturn(1);
		
		assertEquals(1, employeeDao.insertEmployee(emp));
		
	}

}
