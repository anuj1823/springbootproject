package com.firstspringboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.firstspringboot.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
