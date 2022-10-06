package com.example.dataconnect.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dataconnect.model.Employee;
import com.example.dataconnect.repo.EmployeeRepo;
@Service

public class Serviceimp implements Employeeservicein {
 @Autowired
 EmployeeRepo  employeerepo;
	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return this.employeerepo.findAll();
	}
	@Override
	public void saveEmployee(Employee employee) {
		employeerepo.save(employee); 
 		
	}
	@Override
	public void deleteEmployee(int id) {
		employeerepo.deleteById(id);
		
	}
	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> optional=employeerepo.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
			
		}
		return employee;
	}

}
