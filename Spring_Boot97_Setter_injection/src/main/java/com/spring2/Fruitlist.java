package com.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Fruitlist {

	
	private Banana kela;
	
	public Banana getKela() {
		return kela;
	}

	
	@Autowired
	public void setKela(@Qualifier ("kela") Banana mela) {
		this.kela = mela;
	}
	
	
	

	public Fruitlist() 
	{
		
		System.out.println("I am Fruitlist");
	}
	
	
	
	
	
	
}
