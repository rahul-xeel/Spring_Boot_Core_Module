package com.spring2;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

	private int fee;
	
	
	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}


	public Teacher()
	{
		System.out.println("Teacher object created");
	}
	
}
