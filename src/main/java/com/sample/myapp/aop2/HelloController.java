package com.sample.myapp.aop2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController  {
	
	@Autowired
	@Qualifier("helloService")
	IHelloService helloService;
	
	public void hello(String name) {
		System.out.println("HelloConroller: "+helloService.sayHello(name));
	}

	public void goodbye(String name) {
		System.out.println("HelloController: "+helloService.sayGoodbye(name));
	}

}
