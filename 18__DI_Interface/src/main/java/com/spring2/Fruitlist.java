package com.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Fruitlist {

	
	
//	Field Injection
	
	@Autowired
	private Banana kela;
	
	

	public Banana getKela() {
		return kela;
	}

		public void setKela(Banana kela) {
		this.kela = kela;
	}
	
	
	
	
}
