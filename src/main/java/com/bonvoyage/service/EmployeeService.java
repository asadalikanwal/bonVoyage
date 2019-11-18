package com.bonvoyage.service;

import java.util.List;

import com.bonvoyage.domain.Employee;
 
public interface EmployeeService {

	public void save(Employee employee);
	public List<Employee> findAll();
	public Employee findByEmployeeNumber(Long employeeId);
}
