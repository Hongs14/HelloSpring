package com.sample.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@Configurable
@ComponentScan(basePackages= {"com.sample.myapp"})
@ImportResource(value= {"classpath:application-config.xml"})
//기존에 있는 xml파일을 사용하기 위한 아노테이션
public class AppConfig {
	
/*	@Autowired
	IHelloService helloService;

	
	@Bean
	HelloController helloController() {
		//빈의 이름이 메소드 이름
		//변수 정의해도 되고 안해도 된다.
		HelloController controller = new HelloController(helloService);
		return controller;
		
		//return new HelloController(helloService());
	}
	
	*/
}
