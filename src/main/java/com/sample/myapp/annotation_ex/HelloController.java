package com.sample.myapp.annotation_ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController  {
	
	@Autowired 
	IHelloService helloService;
	
//	public HelloController(IHelloService helloService) {
//		this.helloService = helloService;
//	}
	
	//필드위에서 Autowired를 지정해주면 생성자와 setter를 따로 지정하지않아도 된다.
//	public void setHelloService(IHelloService helloService) {
//		this.helloService = helloService;
//	}
//	
	public void hello(String name) {
		System.out.println("HelloConroller: "+helloService.sayHello(name));
		
	}

}
