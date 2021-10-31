package com.demo.springconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.springconcepts.component.Demobean;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
			
		System.out.print("Welcome to spring concepts");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		Demobean demobean = context.getBean(Demobean.class);
		System.out.println("Demo Bean ="+ demobean.toString());
	}

}
