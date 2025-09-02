package com.spring2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringBoot2Application {
	
	
	

	

	public static void main(String[] args) {
		
		
		
		
		ConfigurableApplicationContext container = 	SpringApplication.run(SpringBoot2Application.class, args);
		
		
		Fruitlist fl = (Fruitlist)container.getBean("fruitlist");
		
		  System.out.println(fl);
			    
	    
	}
	
	
	@Bean
	public MyNameIsApple sev()
	{
		System.out.println("sev bean called");
			
		return new MyNameIsApple();
	}
	

	
	
	

}
