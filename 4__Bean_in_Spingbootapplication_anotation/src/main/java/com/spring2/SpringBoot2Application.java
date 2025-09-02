package com.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.xyz")
//@ComponentScan(basePackages={"com.xyz","com.xyz"})
//@SpringBootApplication(scanBasePackageClasses = {"com.xyz*"})


@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2Application.class, args);
	}
	
	@Bean
	public student stduent() 
	{
		System.out.println("Bean is created usnig bean method without any external configuration class and i am using @springbootapplication anotated class");
		return new student();
	}
	

}
