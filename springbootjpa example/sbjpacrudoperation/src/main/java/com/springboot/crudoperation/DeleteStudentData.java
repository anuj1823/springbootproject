package com.springboot.crudoperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.crudoperation.dao.StudentRepository;

@SpringBootApplication
public class DeleteStudentData {

	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(DeleteStudentData.class, args);
		StudentRepository studentrepository = context.getBean(StudentRepository.class);		
		/*----- to delete a particular student -----*/
		studentrepository.deleteById("std110");
		System.out.println("Student having id 'std110' successfully deleted");
	}

}
