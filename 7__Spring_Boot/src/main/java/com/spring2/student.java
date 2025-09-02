package com.spring2;

import org.springframework.stereotype.Component;

@Component
public class student {

	private int age;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	public student()
	{
		System.out.println("Student class created");
	}
	
}
