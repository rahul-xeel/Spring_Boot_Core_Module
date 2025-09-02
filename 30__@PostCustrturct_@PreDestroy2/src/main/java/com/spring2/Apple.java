
package com.spring2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Scope("prototype")
@Component
public class Apple implements InitializingBean,DisposableBean{
	
	
	
	public Apple()
	{
		System.out.println("**********************************************");
		System.out.println("Apple is created ...");
		System.out.println("**********************************************");

	}
	
	
	@PostConstruct
	public void LogicBeanCreation(){

		System.out.println("**********************************************");
		System.out.println("Method is called after bean creation.......");
		System.out.println("**********************************************");

	}



	@PreDestroy
	public void LogicBeanDestruction(){

		System.out.println("**********************************************");
		System.out.println("Method is called before bean destroyed manual method.......");
		System.out.println("**********************************************");

		
	}
	
	

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("**********************************************");
		System.out.println("Method is called after bean creation manual method.......");
		System.out.println("**********************************************");

		
	}



	@Override
	public void destroy() throws Exception {

		System.out.println("**********************************************");
		System.out.println("Method is called before bean destroyed.......");
		System.out.println("**********************************************");

		
	}
	
	
	
	
}
