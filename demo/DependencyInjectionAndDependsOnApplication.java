package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.AppConfig;
import com.example.demo.model.Employee;

@SpringBootApplication
public class DependencyInjectionAndDependsOnApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionAndDependsOnApplication.class, args);
		
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee employee = app.getBean(Employee.class);
		
		employee.display();
	}

}
