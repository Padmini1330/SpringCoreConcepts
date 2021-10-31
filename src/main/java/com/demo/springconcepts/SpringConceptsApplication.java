package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.springconcepts.component.Demobean;
import com.demo.springconcepts.component.EmployeeBean;

@SpringBootApplication
public class SpringConceptsApplication 
{
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);
	
	public static void main(String[] args) 
	{
		logger.debug("Welcome to spring concepts");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		logger.debug("Checking context: ={}",context.getBean(Demobean.class));
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(110);
		employeeBean.setEname("abcd");
		employeeBean.showEmployeeDetails();
	}
}

