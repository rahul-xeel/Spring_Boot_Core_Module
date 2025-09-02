package com.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.xyz")
//@ComponentScan(basePackages={"com.xyz","com.xyz"})
//@SpringBootApplication(scanBasePackageClasses = {"com.xyz*"})



@SpringBootApplication(scanBasePackages = {"com.xyz","com.spring2","com.spring2.*"})
public class SpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2Application.class, args);
	}

}
