package com.example.secondproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.secondproject.dao.TecherRepo;
import com.example.secondproject.entities.Teacher;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringbootjpaApplication.class, args);
		TecherRepo techerrepo=context.getBean(TecherRepo.class);
		Teacher tech1=new Teacher();
		tech1.setTechid("tech103");
		tech1.setTechname("Abhishek Kumar");
		tech1.setSubject("Python");
		Teacher tech2 = techerrepo.save(tech1);
		System.out.println(tech2);
	}

}
