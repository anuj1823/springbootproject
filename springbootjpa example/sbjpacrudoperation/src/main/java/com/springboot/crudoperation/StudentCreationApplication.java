package com.springboot.crudoperation;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.crudoperation.dao.StudentRepository;
import com.springboot.crudoperation.entities.Student;

@SpringBootApplication
public class StudentCreationApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(StudentCreationApplication.class, args);
		StudentRepository stdrepo = context.getBean(StudentRepository.class);
		/*---- Creating multiple student entity---------*/
		Student student1 = new Student("std101","Sunil Kumar","10th",1024,14);
		Student student2 = new Student("std102","Abhay Kumar","9th",1029,12);
		Student student3 = new Student("std103","Saurabh Kumar","10th",1025,15);
		Student student4 = new Student("std104","Anil Kumar","10th",1028,14);
		Student student5 = new Student("std110","Mohit Kumar","8th",1027,12);
		Student student6 = new Student("std107","Suraj Kumar","12th",1030,16);
		Student student7 = new Student("std105","Roshan Raj","9th",1018,13);
		Student student8 = new Student("std109","Abhinav Kumar","8th",1044,13);
		Student student9 = new Student("std106","Raghav Kumar","11th",1014,15);
		Student student10 = new Student("std108","Sahil kumar","12th",1023,15);
		List<Student> stdlist=List.of(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10);
		/*-------- Persisting into database -------------*/
		Iterable<Student> stdlist1=stdrepo.saveAll(stdlist);
		System.out.println("-------- Student Details -----------");
		stdlist1.forEach(student->{
			System.out.println(student);
		});
	}

}
