package com.springboot.crudoperation;

import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.springboot.crudoperation.dao.StudentRepository;
import com.springboot.crudoperation.entities.Student;

@SpringBootApplication
public class StudentDataUpdateApplication {
	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(StudentDataUpdateApplication.class, args);
		StudentRepository studentrepository = context.getBean(StudentRepository.class);		
		/*------ To update Student entity --------*/
		/*---- Retrieve student from id --------*/
		Optional<Student> stddata = studentrepository.findById("std101");
		Student std1=stddata.get();
		std1.setStdname("Abhishek Kumar");
		std1.setStd("11th");
		std1.setRoll(1030);
		std1.setAge(15);
		/*------- Update student data -----*/
		Student std2=studentrepository.save(std1);
		System.out.println(std2);
	}
}
