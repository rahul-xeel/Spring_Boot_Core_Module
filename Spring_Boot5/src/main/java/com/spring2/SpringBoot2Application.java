package com.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan("com.xyz")
//@ComponentScan(basePackages={"com.xyz","com.xyz"})
//@SpringBootApplication(scanBasePackageClasses = {"com.xyz*"})


@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2Application.class, args);
	}
	
	

}
