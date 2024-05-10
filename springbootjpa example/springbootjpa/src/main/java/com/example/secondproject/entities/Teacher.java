package com.example.secondproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher 
{
@Id
private String techid;
private String techname;
private String subject;
public String getTechid() {
	return techid;
}
public void setTechid(String techid) {
	this.techid = techid;
}
public String getTechname() {
	return techname;
}
public void setTechname(String techname) {
	this.techname = techname;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public Teacher(String techid, String techname, String subject) {
	super();
	this.techid = techid;
	this.techname = techname;
	this.subject = subject;
}
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Teacher [techid=" + techid + ", techname=" + techname + ", subject=" + subject + "]";
}

}
