package com.spring2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;


@SpringBootApplication
public class SpringBoot2Application {
	
	
	

	

	public static void main(String[] args) {
		
		
		
		
		ConfigurableApplicationContext container = 	SpringApplication.run(SpringBoot2Application.class, args);
		
		
		databaseconfiguration dbc = (databaseconfiguration)container.getBean("beanofdatabaseconfiguration");
		
		  
		  System.out.println(dbc.getPort());
		  System.out.println(dbc.getUrl());
		  System.out.println(dbc.getUsername());
		  System.out.println(dbc.getPassword());
				

	}
	
	
	@Bean
	public databaseconfiguration beanofdatabaseconfiguration() 
	{
		databaseconfiguration dbc = new databaseconfiguration();
		
		dbc.setPort(1521);
		dbc.setUrl("www.rahul.xeel.in");
		dbc.setUsername("rahulxeel");
		dbc.setPassword("password@123");
		
		return dbc;
		
	}
	


}
