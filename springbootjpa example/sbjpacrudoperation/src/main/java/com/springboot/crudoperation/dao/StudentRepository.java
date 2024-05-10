package com.springboot.crudoperation.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.crudoperation.entities.Student;

public interface StudentRepository extends CrudRepository<Student, String>{

}
