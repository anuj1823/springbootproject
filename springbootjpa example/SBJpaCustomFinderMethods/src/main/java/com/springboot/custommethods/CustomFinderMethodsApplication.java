package com.springboot.custommethods;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.springboot.custommethods.dao.StudentRepository;
import com.springboot.custommethods.entities.Student;

@SpringBootApplication
public class CustomFinderMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CustomFinderMethodsApplication.class, args);
		StudentRepository stdrepo=context.getBean(StudentRepository.class);
		/*----- Custom finder methods ----------*/
		List<Student> stdlist=stdrepo.findByStd("10th");
		for (Student student : stdlist) 
		{
			System.out.println(student);
		}
	}
}
