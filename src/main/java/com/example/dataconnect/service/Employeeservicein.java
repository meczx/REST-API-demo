package com.example.dataconnect.service;

import java.util.List;

import com.example.dataconnect.model.Employee;

public interface Employeeservicein {
	public List<Employee> getAll();
	public void saveEmployee(Employee employee);
	public void deleteEmployee(int id);
	public Employee getEmployeeById(int id);
		
		
	 

}
