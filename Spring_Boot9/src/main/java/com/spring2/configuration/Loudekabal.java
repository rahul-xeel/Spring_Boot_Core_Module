package com.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring2.student;


@Configuration
public class Loudekabal {
	
	
	@Bean
	@Primary
	public student student2() 
	{
		System.out.println("bean created student2 via bean");
		student s = new student();
		s.setName("student2 method");;
		System.out.println("");
		return s;
	}
	
	

	@Bean
	public student student3() 
	{
		System.out.println("bean created student3 via bean");
		student s = new student();
		s.setName("student3 method");;
		System.out.println("");
		return s;
	}
	
}
