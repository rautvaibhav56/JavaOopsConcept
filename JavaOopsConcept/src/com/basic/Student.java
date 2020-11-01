package com.basic;

//main method out side class

public class Student {
	
	static int id; //static bcz it is used in another class
	static String name;
	
}

class TestStudent{
	
	public static void main(String[] args) {
		
		//Creating object
		Student s1=new Student();
		Student s2=new Student();
	
//Initialization through reference
		s1.id=10;
		s1.name="abc";
		System.out.println(s1.id+" "+s1.name);
		
		s2.id=11;
		s2.name="pqr";
		System.out.println(s2.id+" "+s2.name);
		
		
	}
	
	
}