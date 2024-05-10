package com.firstspringboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.firstspringboot.dao.EmployeeRepository;
import com.firstspringboot.entities.Employee;
/*-------- To Scan package of entities-----*/
@EntityScan("com.firstspringboot.entities")
/*---- To Scan package of repositories --------*/
@EnableJpaRepositories("com.firstspringboot.dao")
@SpringBootApplication
public class EmployeeCreation {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeeCreation.class, args);
		EmployeeRepository emprepo=context.getBean(EmployeeRepository.class);
		Employee emp=new Employee();
		emp.setEmpid("emp102");
		emp.setEmpname("Abhijit Kumar");
		emp.setSalary(5000);
		emp.setDesignation("Director");
		/*----------------------------------------------*/
		Employee employee = emprepo.save(emp);
		System.out.println(employee);
	}

}
