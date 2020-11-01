package com.inheritance;
//Single Inheritance:a class inherits another class, it is known as a single inheritance.
//Multilevel Inheritance:a chain of inheritance, it is known as multilevel inheritance.
//Hierarchical : two or more classes inherits a single class, it is known as hierarchical inheritance.

public class Animals {
	
	public static void eat() {
		System.out.println("Eating .....");	
	}
	
}

class Dog extends Animals {
	
	public static void sleep() {
		System.out.println("sleeping....");
		
	}
}
class cat extends Animals{
	public static void Run() {
		System.out.println("Running");
	}
	
}
	class Test extends Animals{
	
	public static void main(String[] args) {
		Animals.eat();
		
	
		cat.Run();
		cat.eat();
	
		
		Dog.sleep();
		Dog.eat();
		
//To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
		//to avoid ambiguity 
	}


}