
package com.spring2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Banana{
	
	
	
	public Banana()
	{
		System.out.println("Banana is created ...");
	}
	
	
}
