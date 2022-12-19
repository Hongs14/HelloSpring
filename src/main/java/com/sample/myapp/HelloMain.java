package com.sample.myapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class HelloMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		System.out.println("----------------------------------");
		
		HelloController helloController = context.getBean(HelloController.class);
		helloController.hello("Eric");
		helloController.goodbye("Dan");
		System.out.println("============================");
		context.close();
	}
}

