package com.sample.myapp.aop2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
//		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config4.xml");
		System.out.println("----------------------------------");
		
		HelloController helloController = context.getBean(HelloController.class);
		helloController.hello("Eric");
		helloController.goodbye("Dan");
		System.out.println("============================");
		context.close();
	}
}
