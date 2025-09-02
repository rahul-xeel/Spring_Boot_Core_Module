
package com.spring2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Order(1)
@Component
public class Banana implements ApplicationRunner{
	
	
	
	public Banana()
	{
		System.out.println("**********************************************");
		System.out.println("Banana is created ...");
		System.out.println("**********************************************");

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		System.out.println("**********************************************");
		System.out.println("THIS IS MY OWN ApplicationRunner logic ...");
		System.out.println("**********************************************");

		
	}

	
	
	
}
