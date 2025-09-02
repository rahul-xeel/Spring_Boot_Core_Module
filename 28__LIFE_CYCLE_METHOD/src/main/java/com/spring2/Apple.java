
package com.spring2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Apple implements InitializingBean,DisposableBean{
	
	
	
	public Apple()
	{
		System.out.println("Apple is created ...");
	}
	
	

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Method is called after bean creation.......");
		
	}



	@Override
	public void destroy() throws Exception {

		System.out.println("Method is called before bean destroyed.......");

		
	}
	
	
	
	
}
