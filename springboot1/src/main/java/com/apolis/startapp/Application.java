package com.apolis.startapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.apolis.utility.DbDetails;

@SpringBootApplication
@ComponentScan("com.apolis")
public class Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Application.class, args);
		DbDetails details = (DbDetails)context.getBean("dbDetails");
		System.out.println(details);
	
	}

}
