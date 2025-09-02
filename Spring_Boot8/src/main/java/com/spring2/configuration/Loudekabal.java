package com.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.spring2.student;


@Configuration
public class Loudekabal {

	@Bean
	public student student() 
	{
		student s = new student();
		s.setAge(21);
		System.out.println("This student bean is created via bean using external configuration class");
		return s;
	}
	
	

	@Bean
	public student student2() 
	{
		System.out.println("This student2 bean is created via bean using external configuration class");
		return new student();
	}
	
}
