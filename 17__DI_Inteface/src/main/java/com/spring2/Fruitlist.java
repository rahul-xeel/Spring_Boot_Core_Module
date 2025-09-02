package com.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Fruitlist {

	
	private Banana kela;
	
	
	
	
	@Autowired
	public Fruitlist(@Qualifier ("kela") Banana mela) {
		super();
		this.kela = mela;
	}
	
	
	
	

	public Banana getKela() {
		return kela;
	}

		public void setKela(Banana kela) {
		this.kela = kela;
	}
	

//	public Fruitlist() 
//	{
//		
//		System.out.println("I am Fruitlist");
//	}
	 
	
	
	
	
	
}
