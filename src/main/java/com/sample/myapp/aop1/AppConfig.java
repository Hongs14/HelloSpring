package com.sample.myapp.aop1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@Configurable
@ComponentScan(basePackages= {"com.sample.myapp.aop1"}) //아노테이션과 같이 사용하고 싶을 때
@ImportResource({"classpath:application-config3.xml"})
//기존에 있는 xml파일을 사용하기 위한 아노테이션
public class AppConfig {
	
	/*@Bean
	IHelloService helloService() {
		//빈의 이름이 메소드 이름
		//xml코드보다 자바가 더 편한 사람이 사용하기 편함
		return new HelloService();
	}*/
	
	@Autowired
	IHelloService helloService;
	
	@Bean
	HelloController helloController() {
		HelloController controller = new HelloController(helloService);
		return controller;
//		return new HelloController();
	}
}
