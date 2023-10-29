package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Employee {
	
	@Autowired
	User user;

	public String emp_name;
	
	public Employee() {
		
	}
	
	public void setEmp_name(String emp_name) {
		
		this.emp_name = emp_name;
	}
	
	public String getEMp_name() {
		return this.emp_name;
	}
	
	public void display() {
		
		System.err.println("Emp CLass");
		user.display();
	}
	
	
	
}
