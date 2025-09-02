package com.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.spring2.studenta;


@Configuration
public class Configuration_Class {

	@Bean
	public studenta student() 
	{
		studenta s = new studenta();
		s.setAge(21);
		System.out.println("This student bean is created via bean using external configuration class");
		return s;
	}
	
	

	@Bean
	public studenta student2() 
	{
		System.out.println("This student2 bean is created via bean using external configuration class");
		return new studenta();
	}
	
}
