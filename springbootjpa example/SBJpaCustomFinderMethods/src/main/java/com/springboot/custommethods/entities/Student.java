package com.springboot.custommethods.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	@Id
	private String stdid;
	private String stdname;
	private String std;
	private int roll;
	private int age;
	public String getStdid() {
		return stdid;
	}
	public void setStdid(String stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String stdid, String stdname, String std, int roll, int age) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.std = std;
		this.roll = roll;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student Details :\n Student Id : " + stdid + "\n Name : " + stdname + "\n Standard : " + std + "\n Roll No. : " + roll + "\n Age : " + age
				+ "\n--------------------------------------------------------";
	}
	
}
