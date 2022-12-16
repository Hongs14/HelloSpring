package com.sample.myapp.aop1;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class HelloLog {
	public void log(JoinPoint joinpoint) {
		Signature signature = joinpoint.getSignature();
		String methodName = signature.getName();
		System.out.println(methodName+"메소드가 호출됩니다.");
		
		System.out.println(">>>"+ new java.util.Date());
	}
}
