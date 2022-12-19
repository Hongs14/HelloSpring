package com.sample.myapp;

public class Person {
	private String name;
	private int age;
	
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge(int age) {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Person [name =" + name + ", age = " + age + "]";
	}
	
	
	
}
