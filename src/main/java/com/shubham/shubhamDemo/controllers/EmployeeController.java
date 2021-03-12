package com.shubham.shubhamDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.shubham.shubhamDemo.modal.Employee;
import com.shubham.shubhamDemo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/welcome")
	public ModelAndView home() {
		return new ModelAndView("welcome");
	}

	@GetMapping(value = "/addNewEmployee")
	public ModelAndView addNewEmployee() {
		return new ModelAndView("addEmployee", "emp", new Employee());
	}

	@PostMapping(value = "/addNewEmployee")
	public ModelAndView addNewEmployee(@ModelAttribute("emp") Employee emp) {
		int i = employeeService.insertEmployee(emp);
		
		if (i == 1) {
			ModelAndView model = new ModelAndView("getEmployees");
			List<Employee> employees = employeeService.getAllEmployees();
			model.addObject("employees", employees);
			return model;
		} else {
			ModelAndView model = new ModelAndView("error");
			model.addObject("error", "Error Occured While Insertion");
			return model;
		}
	}

	@GetMapping("/getEmployees")
	public ModelAndView getEmployees() {
		List<Employee> employees = employeeService.getAllEmployees();
		ModelAndView model = new ModelAndView("getEmployees");
		model.addObject("employees", employees);
		return model;
	}
}
