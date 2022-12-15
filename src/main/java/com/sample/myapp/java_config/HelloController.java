package com.sample.myapp.java_config;


public class HelloController  {
	
	IHelloService helloService;
	
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	//필드위에서 Autowired를 지정해주면 생성자와 setter를 따로 지정하지않아도 된다.
//	public void setHelloService(IHelloService helloService) {
//		this.helloService = helloService;
//	}
//	
	public void hello(String name) {
		System.out.println("HelloConroller: "+helloService.sayHello(name));
		
	}

}
