package com.springboot.custommethods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.custommethods.dao.StudentRepository;
import com.springboot.custommethods.entities.Student;

@SpringBootApplication
public class FindByStdidandStdExample {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FindByStdidandStdExample.class, args);
		StudentRepository stdrepo=context.getBean(StudentRepository.class);
		/*---- Custom Finder methods ---------*/
		Student student=stdrepo.findByStdidAndStd("std106", "11th");
		System.out.println(student);
	}

}
