package com.basic;

public class Student1 extends Student {
	
//Initialization through method
	public  void insertRecord(int i,String n) {
		id=i;
		name=n;
		
	}
	
	public void displayRecord() {
		
		System.out.println(id+""+name);
	}

	public static void main(String[] args) {
		
		Student1 s = new Student1();
		Student1 s2 = new Student1();
		
		s.insertRecord(1," abc");
		s.displayRecord();

		s2.insertRecord(2," pqr");
		s2.displayRecord();
	}

}
