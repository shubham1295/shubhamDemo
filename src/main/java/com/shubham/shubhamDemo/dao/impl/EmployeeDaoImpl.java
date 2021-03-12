package com.shubham.shubhamDemo.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.shubham.shubhamDemo.dao.EmployeeDao;
import com.shubham.shubhamDemo.modal.Employee;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public int insertEmployee(Employee emp) {
		String sql = "insert into employee (empId, empName) values (?,?)";
		String[] args = new String[2];
		args[0] = emp.getEmpId();
		args[1] = emp.getEmpName();
		return getJdbcTemplate().update(sql, args);
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "select * from employee";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		List<Employee> result = new ArrayList<Employee>();
		for (Map<String, Object> row : rows) {
			Employee emp = new Employee();
			emp.setEmpId((String) row.get("empId"));
			emp.setEmpName((String) row.get("empName"));
			result.add(emp);
		}

		return result;
	}

}
