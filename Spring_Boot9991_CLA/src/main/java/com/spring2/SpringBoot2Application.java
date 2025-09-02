package com.spring2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		
		for(String arguments : args) 
		{
				System.out.println(arguments);
		}
		

		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot2Application.class, args);
		

		System.out.println("**********************************************");
		System.out.println("Run method executed...");
		System.out.println("**********************************************");

		

		

	}

}
