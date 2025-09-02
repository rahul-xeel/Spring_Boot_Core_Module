package com.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class student {

	private int age;
	
	@Autowired
	public Teacher teacher;
	
	
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
