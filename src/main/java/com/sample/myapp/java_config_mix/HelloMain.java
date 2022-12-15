package com.sample.myapp.java_config_mix;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		//9번 줄은 웹개발 중에는 작성하지 않아도 된다.
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("----------------------------------");
		
		HelloController helloController = context.getBean(HelloController.class);
		helloController.hello("홍길동");
		System.out.println("============================");
		
		context.close();
	}
}
