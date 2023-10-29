package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.example.demo.model.Employee;
import com.example.demo.model.User;

@Configuration
public class AppConfig {

	
	@Bean
	@DependsOn("getUser")
//	Multiple Beans
//	@DependsOn(value = {"",""})
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean
	public User getUser() {
		return new User();
	}
	
}
