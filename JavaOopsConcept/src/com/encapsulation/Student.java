package com.encapsulation;
//encapsulation:Encapsulation in Java is a process of wrapping code and data together into a single unit
public class Student {
	
	private String name;//Data Hiding
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
