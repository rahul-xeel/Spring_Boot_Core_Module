package com.spring2;

import org.springframework.stereotype.Component;

@Component("rahul")
public class student {

	private String name = "component_student";
		
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public student()
	{
		System.out.println("Student bean created via component");
	}
	
}
