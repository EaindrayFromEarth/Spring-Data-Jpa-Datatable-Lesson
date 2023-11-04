package com.example.springboottest.springboottest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboottest.springboottest.model.Employee;



@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	Optional<Employee> findById(Long id);
	//Optional Employee void findOne(long id);


}


