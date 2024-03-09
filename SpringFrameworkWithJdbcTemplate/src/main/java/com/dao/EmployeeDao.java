package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int storeEmployee(Employee employee) {
		try {
			return jdbcTemplate.update("insert into employee values(?,?,?)", employee.getId(),employee.getName(),employee.getSalary());
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int deleteEmployee(int id) {
		try {
			return jdbcTemplate.update("delete from employee where id = ?",id);
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public int updateEmployee(Employee employee) {
		try {
			return jdbcTemplate.update("update employee set salary =? where id =?", employee.getSalary(),employee.getId());
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public List<Map<String, Object>> retrieveEmployee() {
		try {
			return jdbcTemplate.queryForList("select * from employee");
		}catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public List<Map<String, Object>> retrieveEmployeeBySalary(float salary) {
		try {
			return jdbcTemplate.queryForList("select * from employee where salary > ?", salary);
		}catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public List<Employee> findEmployeeAsList() {
		try {
			return jdbcTemplate.query("select * from employee", new MyRowMapper());
		}catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public List<Employee> findEmployeeAsListAsSalary(float salary) {
		try {
			return jdbcTemplate.query("select * from employee where salary > ?", new MyRowMapper(),salary);
		}catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
		
}

class MyRowMapper implements RowMapper<Employee>{
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getFloat(3));
		return emp;
	}
}
