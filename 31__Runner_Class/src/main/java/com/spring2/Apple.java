
package com.spring2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Apple implements CommandLineRunner{
	
	
	
	public Apple()
	{
		System.out.println("**********************************************");
		System.out.println("Apple is created ...");
		System.out.println("**********************************************");

	}

	@Override
	public void run(String... args) throws Exception {

		
		System.out.println("**********************************************");
		System.out.println("THIS IS MY OWN COMMANDLINE ARGUMENT ...");
		System.out.println("**********************************************");

		
	}
	
	
	
}
