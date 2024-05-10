package com.springboot.custommethods.dao;

import org.springframework.data.repository.CrudRepository;
import java.util.*;
import com.springboot.custommethods.entities.Student;

public interface StudentRepository extends CrudRepository<Student, String> 
{
	List<Student> findByStd(String std);
	List<Student> findByAgeLessThan(int age);
	Student findByStdidAndStd(String stdid,String std);
}
