package com.sample.myapp.aop1;

public class HelloController  {

	IHelloService helloService;
	
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}
//	public void setHelloService(IHelloService helloService) {
//		this.helloService = helloService;
//	}

	
	public void hello(String name) {
		System.out.println("HelloConroller: "+helloService.sayHello(name));
	}


}
