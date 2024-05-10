package com.springboot.crudoperation;

import java.util.Iterator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.springboot.crudoperation.dao.StudentRepository;
import com.springboot.crudoperation.entities.Student;

@SpringBootApplication
public class RetrieveStudentData {

	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(RetrieveStudentData.class, args);
		StudentRepository stdrepo = context.getBean(StudentRepository.class);
		/*----- tO Retrieve Single entity-------*/
//		Optional<Student> stddata = stdrepo.findById("std101");
		/*---- To retrieve all students data ----- */
		Iterable<Student> stddata = stdrepo.findAll();
		Iterator<Student> stdlist = stddata.iterator();
		while(stdlist.hasNext())
		{
			System.out.println(stdlist.next());
		}
	}

}
