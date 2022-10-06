package com.example.dataconnect.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dataconnect.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
