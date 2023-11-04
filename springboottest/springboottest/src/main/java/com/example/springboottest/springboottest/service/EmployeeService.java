package com.example.springboottest.springboottest.service;

import java.util.List;
import java.util.Optional;

import com.example.springboottest.springboottest.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public Optional<Employee> getEmployeeById(long id);
	
}